package repository.user;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	private int user_code;
	private String username;
	private String password;
	private String name;
	private String email;
	private LocalDateTime create_date;
	private LocalDateTime update_date;
}
