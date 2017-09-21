package ca.nexapp.core.random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class WeightedSet<E> extends HashSet<E> {

    private static final long serialVersionUID = -6569181987915151777L;

    private final Function<E, Number> weightFunction;

    public WeightedSet(Collection<E> items, Function<E, Number> weightFunction) {
        super(items);
        this.weightFunction = weightFunction;
    }

    public Optional<E> pickOne() {
        if (isEmpty()) {
            return Optional.empty();
        }

        List<E> duplicated = new ArrayList<>();

        for (E item : this) {
            Number timesDuplicated = weightFunction.apply(item);
            Stream.iterate(0L, n -> n + 1)
                    .limit(Math.max(timesDuplicated.longValue(), 0)) // ignore negative value
                    .forEach(i -> duplicated.add(item));
        }

        int randomIndex = new Random().nextInt(duplicated.size());
        E found = duplicated.get(randomIndex);
        return Optional.ofNullable(found);
    }
}
