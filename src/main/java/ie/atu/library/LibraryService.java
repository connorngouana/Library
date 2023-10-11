package ie.atu.library;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class LibraryService
{
        public String addbook(Library book)
        {
                String BookDetails = "Name: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nISBN: " + book.getIbsn() + "\nYear: " + book.getYear();
                return BookDetails;
        }


}
