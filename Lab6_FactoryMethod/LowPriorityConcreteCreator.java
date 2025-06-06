package CSE_305.Lab6_FactoryMethod;

public class LowPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        return new LowPriorityConcrete();
    }
}