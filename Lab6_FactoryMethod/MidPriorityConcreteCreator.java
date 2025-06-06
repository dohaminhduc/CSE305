package CSE_305.Lab6_FactoryMethod;

public class MidPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        return new MidPriorityConcrete();
    }
}