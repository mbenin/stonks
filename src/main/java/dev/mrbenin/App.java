package dev.mrbenin;

import dev.mrbenin.dto.MovimentacaoB3DTO;
import dev.mrbenin.services.B3Service;
import dev.mrbenin.services.impl.B3ServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final Logger logger = LogManager.getLogger(App.class);         

    public static void main( String[] args )
    {
    
        String file = "/mnt/c/Users/mbeni/OneDrive/Documentos/Investimentos/movimentacao-01112019-31102020.xlsx";
        B3Service b3service = new B3ServiceImpl();

        }
    
    }


}
