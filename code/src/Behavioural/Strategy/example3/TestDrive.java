package Behavioural.Strategy.example3;

public class TestDrive {
    public static void main(String[] args) {
        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.setShareMedium(new ShareByEmail());
        basicCameraApp.share();

        PhoneCameraApp cameraPlusApp = new CameraPlusApp();
        cameraPlusApp.setShareMedium(new ShareByText());
        cameraPlusApp.share();

        cameraPlusApp.setShareMedium(new ShareBySocial());
        cameraPlusApp.share();
    }
}
