package ie.atu.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController
{
    private final LibraryService myLibraryService;
    @Autowired
    public LibraryController(LibraryService myLibraryService)
    {
        this.myLibraryService = myLibraryService;
    }

    @PostMapping("/librarydets")
    public String Registering(@RequestBody Library library)
    {
        return myLibraryService.addbook(library);
    }






}
