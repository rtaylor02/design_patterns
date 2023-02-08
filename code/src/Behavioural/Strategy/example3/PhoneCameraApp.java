package Behavioural.Strategy.example3;

public abstract class PhoneCameraApp {
    ShareMedium shareMedium;

    public abstract void edit();

    public void take() {
        System.out.println("Click.. Taking a photo..");
    }

    public void save() {
        System.out.println("Saving the photo..");
    }

    //region Without Strategy pattern:
    /*
    everytime new way of sharing is introduced, we have to modify this section of the code with the risk of
    introducing a new bug which will be inherited by all of the subclasses.
     */
//    public void share(@NotNull String method) {
//        if(method.equals("sms")) {
//            System.out.println("sharing by text..");
//        } else if (method.equals("email")) {
//            System.out.println("sharing by email..");
//        } else {
//            System.out.println("unknown sharing method");
//        }
//    }
    //endregion

    //region With Strategy pattern:
    /*
    We allow the sharing behaviour depends on the subclass's own ShareMedium (Composition over Inheritance).
     */
    public void share() {
        if (shareMedium != null) {
            shareMedium.share();
        } else {
            System.out.println("Using default ShareMedium - ShareByEmail");
            setShareMedium(new ShareByEmail());
        }
    }
    //endregion

    public void setShareMedium(ShareMedium shareMedium) {
        this.shareMedium = shareMedium;
    }
}
