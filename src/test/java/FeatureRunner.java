import com.intuit.karate.junit5.Karate;

class FeatureRunner {

    @Karate.Test
    Karate testUsers(){
        return new Karate().tags("bookit").relativeTo(getClass());
    }

}
