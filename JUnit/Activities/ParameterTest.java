package Examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@CsvFileSource(files = 'src/test/resources/input.csv",numLineToSkip = 1)
        
public void csvTest{ ArgumentsAccessor args)
{
    System.out.println(
            args.getString(0) +
        ","+
        )
    
        }
}
