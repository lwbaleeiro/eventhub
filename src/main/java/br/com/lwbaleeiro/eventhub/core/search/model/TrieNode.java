package br.com.lwbaleeiro.eventhub.core.search.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class TrieNode {
    private final Map<Character, TrieNode> children = new HashMap<>();
    private final Set<Long> eventIds = new HashSet<>();
    private boolean isEndOfWord = false;
}
