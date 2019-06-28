import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
	private static final int GIGASECONDS = 1_000_000_000;
	private LocalDateTime dateResult;

	Gigasecond(LocalDate birthDate) {
		this(birthDate.atStartOfDay());
	}

	Gigasecond(LocalDateTime birthDateTime) {
		dateResult = birthDateTime.plusSeconds(GIGASECONDS);
	}

	LocalDateTime getDateTime() {
		return dateResult;
	}
}
