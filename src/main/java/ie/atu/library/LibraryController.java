package ie.atu.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
public class LibraryController
{
    private final LibraryService myLibraryService;
    Map<String,String> responseMessage = new HashMap<>();
    @Autowired
    public LibraryController(LibraryService myLibraryService)
    {
        this.myLibraryService = myLibraryService;
    }

    @PostMapping("/librarydets")
    public Map <String, String> Registering(@RequestBody Library library)
    {
        String confirm = myLibraryService.addbook(library);

        responseMessage.put("message",confirm );
        return responseMessage;
    }

    @GetMapping("")
    public String getbook()
    {
        return responseMessage.toString();
    }





}
