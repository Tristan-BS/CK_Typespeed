package CK;

public enum TextList {
    EASY("That is a simple easy Typing Speed Test."),
    NORMAL("Thats a Normal Typespeed Test, house of Glory its great Yes."),
    HARD("Very Hard right now beCause You Never Know WHats Coming nexT do you? Nah u dont know bruh."),
    IMPOSSIBLE("HOw CaN YOu Do ThIS? ItS NOt POsIbLE WTf?!");

    private final String Text;

    TextList(String Text) {
        this.Text = Text;
    }

    public String getText() {
        return Text;
    }
}
