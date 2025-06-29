public class BookService {
    private final LibraryApi libraryApi;

    public BookService(LibraryApi libraryApi) {
        this.libraryApi = libraryApi;
    }

    public boolean checkAvailability(String title) {
        return libraryApi.isAvailable(title);
    }
}
