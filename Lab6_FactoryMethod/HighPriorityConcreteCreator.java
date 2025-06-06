package CSE_305.Lab6_FactoryMethod;

public class HighPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        return new HighPriorityConcrete();
    }
}