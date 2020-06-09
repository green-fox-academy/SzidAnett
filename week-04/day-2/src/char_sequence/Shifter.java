package char_sequence;

public class Shifter implements CharSequence{
    protected String string;
    protected int shiftFor;

    public Shifter(String string, int shiftFor){
        this.string = string;
        this.shiftFor = shiftFor;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(this.shiftFor+index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
