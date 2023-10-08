package ie.atu.library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library
{

    private String title;
    private String author;
    private String ibsn;
    private String year;


}
