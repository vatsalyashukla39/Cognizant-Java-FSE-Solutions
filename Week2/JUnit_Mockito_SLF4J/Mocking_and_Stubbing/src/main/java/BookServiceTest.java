import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

    class BookServiceTest {

        @Test
        void shouldReturnTrueWhenBookIsAvailable() {
            LibraryApi mockApi = mock(LibraryApi.class);
            when(mockApi.isAvailable("Clean Code")).thenReturn(true);

            BookService service = new BookService(mockApi);
            boolean available = service.checkAvailability("Clean Code");

            assertTrue(available);
        }
    }


