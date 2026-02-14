package Workshop;

import org.junit.*;

import static org.junit.Assert.*;

public class LibraryServiceTest {

    private LibraryService libraryService;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Starting LibraryService Test Suite");
    }

    @Before
    public void setUp() {
        libraryService = new LibraryService();
        System.out.println("LibraryService initialized");
    }

    @After
    public void tearDown() {
        libraryService.clearLibrary();
        System.out.println("Library cleared after test");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All LibraryService tests completed");
    }

    @Test
    public void testAddBookAndSearchSuccess() {
        libraryService.addBook("Clean Code");

        assertTrue(libraryService.searchBook("Clean Code"));
    }

    @Test
    public void testSearchBookNotFound() {
        libraryService.addBook("Effective Java");

        assertFalse(libraryService.searchBook("Design Patterns"));
    }
}
