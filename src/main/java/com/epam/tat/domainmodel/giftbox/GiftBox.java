package com.epam.tat.domainmodel.giftbox;

import com.epam.tat.domainmodel.candies.Candy;
import com.epam.tat.domainmodel.util.Finding;
import com.epam.tat.domainmodel.util.Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GiftBox implements Sorting, Finding {

    private List<Candy> candiesList;

    public GiftBox() {
        candiesList = new ArrayList<>();
    }

    public void addCandy(Candy candy) {
        this.candiesList.add(candy);
    }

    @Override
    public List<Candy> sortCandiesByNameAsc() {
        if (candiesList.isEmpty() || candiesList.size() == 1) {
            return candiesList;
        }
        candiesList.sort(Comparator.comparing(Candy::getName));
        return candiesList;
    }

    @Override
    public List<Candy> sortCandiesByWeightAsc() {
        if (candiesList.isEmpty() || candiesList.size() == 1) {
            return candiesList;
        }
        candiesList.sort(Comparator.comparingInt(Candy::getWeight));
        return candiesList;
    }

    @Override
    public List<Candy> findCandiesByNameStartedWith(char candyNameFirstLetter) {
        if (candiesList.isEmpty()) {
            return candiesList;
        }
        return candiesList.stream()
                .filter(c -> c.getName().startsWith(String.valueOf(candyNameFirstLetter)))
                .sorted(Comparator.comparing(Candy::getName))
                .collect(Collectors.toList());
    }

    @Override
    public List<Candy> findCandiesByWeightInRange(int weightFrom, int weightTo) {
        if (candiesList.isEmpty()) {
            return candiesList;
        }
        return candiesList.stream()
                .filter(c -> (c.getWeight() >= weightFrom && c.getWeight() <= weightTo))
                .sorted(Comparator.comparingInt(Candy::getWeight))
                .collect(Collectors.toList());
    }
}
