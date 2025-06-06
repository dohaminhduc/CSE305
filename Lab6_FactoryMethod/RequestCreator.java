package CSE_305_Lab2.Lab6_FactoryMethod;

public abstract class RequestCreator {
    public abstract RequestProduct createRequest();

    public void processRequest() {
        RequestProduct request = createRequest();
        request.setPriority("Default");
        request.setExpire("7 days");
        request.setStatus("New");
        request.processRequest();
    }
}
