package mock;

public class MockDoorPanel extends DoorPanel {
    private boolean closeCalled = false;

    @Override
    public void close() {
        closeCalled = true;
        System.out.println("method close invoked!");
    }

    void verifyClosedCalled() {
        assert closeCalled;
    }
}
