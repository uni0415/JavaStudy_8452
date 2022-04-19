package web.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FileResponseDto {
	private int fileCode;
	private String fileName;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
}
