import java.util.stream.Stream;

public enum DaysOfWeekEnum {
    SUNDAY("off"),
    MONDAY("working"),
    TUESDAY("working"),
    WEDNESDAY("working"),
    THURSDAY("working"),
    FRIDAY("working"),
    SATURDAY("off");

    private String typeOfDay;

    DaysOfWeekEnum(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    // standard getters and setters

    public static Stream<DaysOfWeekEnum> stream() {
        return Stream.of(DaysOfWeekEnum.values());
    }
}
