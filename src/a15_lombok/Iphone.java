package a15_lombok;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Iphone {
	private int series;
	private String model;
	private String color;
	private int memorySize;
	private int releaseYear;
	
	
}
