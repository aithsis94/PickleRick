package in.sampleapp;

import in.picklerick.Inject;
import in.picklerick.PickleRick;

public class ShowRoom {

    @Inject
    ICar car;

    public ShowRoom(){
        PickleRick.inject(this);
    }

    public ICar getCar() {
        return car;
    }
}
