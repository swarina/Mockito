import com.train.EmailService;
import com.train.PassengerRepository;
import com.train.TrainBarriers;
import org.junit.Test;

import static org.mockito.Mockito.*;
public class TrainBarrierTest {

    @Test
    public void passengerEntry(){

        final int PASSENGER_ID = 3;

        PassengerRepository passengerRepositoryMock = mock(PassengerRepository.class);
        EmailService emailServiceMock = mock(EmailService.class);
        TrainBarriers trainBarriers = new TrainBarriers(passengerRepositoryMock, emailServiceMock);

        trainBarriers.passengerEntry(PASSENGER_ID);

        verify(passengerRepositoryMock).registerPassengerOnTrain(PASSENGER_ID);
        verify(emailServiceMock).notifyPassenger(PASSENGER_ID);
    }
}