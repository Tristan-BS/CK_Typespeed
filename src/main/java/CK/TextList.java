package CK;

public enum TextList {
    EASY("That is a simple easy Typing Speed Test. The quick brown fox jumps over the lazy dog."),
    NORMAL("Thats a Normal Typespeed Test, house of Glory its great Yes. Programming is fun, especially when you are learning new things."),
    HARD("Very Hard right now beCause You Never Know WHats Coming nexT do you? Nah u dont know bruh. The complexities of code can be overwhelming at times."),
    IMPOSSIBLE("HOw CaN YOu Do ThIS? ItS NOt POsIbLE WTf?! Typing at this speed requires immense concentration and skill.");

    private final String Text;

    TextList(String Text) {
        this.Text = Text;
    }

    public String getText() {
        return Text;
    }
}