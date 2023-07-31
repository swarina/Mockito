import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import com.hotel.Booking;
import com.hotel.Dao;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookingTest {

    private Dao daoMock;
    private Booking booking;

    @Before
    public void setup() throws SQLException {

        daoMock = mock(Dao.class);
        booking = new Booking(daoMock);

        List<String> availableRooms = Arrays.asList("A");
        when(daoMock.fetchAvailableRooms()).thenReturn(availableRooms);

    }

    @Test
    public void checkAvailableRoomsTrue() throws SQLException {
        Assertions.assertTrue(booking.checkRoomAvailability("A"));
    }

    @Test
    public void checkAvailableRoomsFalse() throws SQLException {
        Assertions.assertFalse(booking.checkRoomAvailability("B"));
    }
}