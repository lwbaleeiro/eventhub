package br.com.lwbaleeiro.eventhub.core.search.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Trie {
    private final TrieNode root = new TrieNode();

    public void insert(String word, Long eventId) {
        TrieNode node = root;
        for (char ch : word.toLowerCase().toCharArray()) {
            node = node.getChildren().computeIfAbsent(ch, c -> new TrieNode());
            node.getEventIds().add(eventId);
        }

        node.setEndOfWord(true);
    }

    public Set<Long> search(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toLowerCase().toCharArray()) {
            node = node.getChildren().get(ch);
            if (node == null) return Collections.emptySet();
        }

        return node.getEventIds();
    }
}
