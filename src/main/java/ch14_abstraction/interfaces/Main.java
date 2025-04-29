package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton(),
                new VolumeDownButton(),
                new VolumeUpButton()
        );

        tvRemoteController.power();
        tvRemoteController.channelUp();
        tvRemoteController.channelUping();
        tvRemoteController.channelDown();
        tvRemoteController.channelDowning();
        tvRemoteController.volumeUp();
        tvRemoteController.volumeUping();
        tvRemoteController.volumeDown();
        tvRemoteController.volumeDowning();
    }
}
