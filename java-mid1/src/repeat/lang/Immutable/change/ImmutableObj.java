package repeat.lang.Immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        int result = value+addValue;
        return new ImmutableObj(result);
//        return new ImmutableObj(value+addValue); //이렇게 함축가능

    }

    public int getValue() {
        return value;
    }
}
