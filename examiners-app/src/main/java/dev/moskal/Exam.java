package dev.moskal;

import java.util.Date;
import lombok.Data;

@Data
public class Exam {
	private final String id;
	private final String category;
	private final Date date;
	private final String result;
	private final String car;
	private final String otherDetails;
}
