import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class BestMovieService {
    private Movie movie;

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie)
    {
        this.movie = movie;
    }

    public Movie getbestMovie(){
        return movie;
    }
}
