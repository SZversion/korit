package ch14_abstraction.interfaces;

public class TvRemoteController {
    private PowerButton powerbutton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(
            PowerButton powerbutton,
            ChannelDownButton channelDownButton,
            ChannelUpButton channelUpButton,
            VolumeDownButton volumeDownButton,
            VolumeUpButton volumeUpButton
    ) {
        this.powerbutton = powerbutton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    public void power() {
        System.out.print("TV의 ");
        powerbutton.onPressed();
    }
    public void channelUp() {
        System.out.print("TV의 ");
        channelUpButton.onPressed();
    }
    public void channelUping() {
        System.out.print("TV의 ");
        System.out.println(channelUpButton.onUp());
    }
    public void channelDown() {
        System.out.print("TV의 ");
        channelDownButton.onPressed();
    }
    public void channelDowning() {
        System.out.print("TV의 ");
        System.out.println(channelDownButton.onDown());
    }
    public void volumeDown() {
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }
    public void volumeDowning() {
        System.out.print("TV의 ");
        System.out.println(volumeDownButton.onDown());
    }
    public void volumeUp() {
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }
    public void volumeUping() {
        System.out.print("TV의 ");
        System.out.println(volumeUpButton.onUp());
    }

}
