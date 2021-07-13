package skt;

import javax.swing.text.html.Option;
import java.util.*;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.math.BigDecimal.ZERO;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class s2 {
	public static void main(String[] args) {
		System.out.println(pre());
	}

	private static Stream<BigDecimal> pre() {
		Stream<BigDecimal> inpit = Stream.of(BigDecimal.valueOf(1), BigDecimal.valueOf(2),BigDecimal.valueOf(3),BigDecimal.valueOf(4),BigDecimal.valueOf(5));
		//inpit.collect(Collectors.groupingBy(it -> it.divide(BigDecimal.valueOf(3)));
		return null;
	}

	private boolean filter(BigDecimal input) {
		return input != null && input.compareTo(ZERO) >= 0;
	}
}

/*
class SamplePreprocessor {

	private final SampleNormalizer normalizer;

	SamplePreprocessor(SampleNormalizer normalizer) {
		this.normalizer = normalizer;
	}

	Stream<BigDecimal> preprocess(Stream<BigDecimal> input) {
		return null;
	}
}
*/
/*

class SampleNormalizer {
	Stream<BigDecimal> normalize(BigDecimal input) {
		System.out.println("테스트?");
		return null;
	}
}*/
