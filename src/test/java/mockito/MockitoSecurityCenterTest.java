package mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import mock.DoorPanel;
import mock.SecurityCenter;

public class MockitoSecurityCenterTest {
    private SecurityCenter securityCenter;
    DoorPanel doorPanel;

    @BeforeEach
    public void setUp() {
        doorPanel = Mockito.mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }

    @Test
    public void verify_door_is_closed() {
        securityCenter.switchOn();
        Mockito.verify(doorPanel).close();
    }

}
