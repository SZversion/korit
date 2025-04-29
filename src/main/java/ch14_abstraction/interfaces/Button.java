package ch14_abstraction.interfaces;

public abstract class Button implements Up, Down, Press{

    @Override
    public abstract void onPressed();

    @Override
    public String onDown() {
        return "내립니다.";
    };

    @Override
    public String onUp() {
        return "올립니다.";
    };
}