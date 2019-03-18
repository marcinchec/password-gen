package pl.dominisz.java8desktop;

import java.util.List;

public interface PasswordGeneratorService {
    String generate(PasswordGeneratorParameters passwordGeneratorParameters);
    List<String> generate(PasswordGeneratorParameters passwordGeneratorParameters, int count);
}
