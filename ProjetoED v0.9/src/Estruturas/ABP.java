package Estruturas;

import Exceptions.*;
import Interface.Arvore.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Pablo Suria
 */
public class ABP {

    public static class Node {

        private int content;
        private Node left, right;

        public Node(int content) {
            this.content = content;
            this.left = null;
            this.right = null;
        }

        public int getContent() {
            return content;
        }

        public void setContent(int content) {
            this.content = content;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

    }

    private Node root;
    private JScrollPane pane;

    public ABP(JScrollPane pane) {
        root = null;
        this.pane = pane;
    }

    public boolean empty() {
        return root == null;
    }

    private Node search(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (current.getContent() == value) {
            return current;
        }

        if (current.getContent() > value) {
            return search(current.getLeft(), value);
        } else {
            return search(current.getRight(), value);
        }
    }

    public Node search(int value) throws DadoNaoEncontradoException, EstruturaVaziaException {
        if (empty()) {
            throw new EstruturaVaziaException("A Arvore esta vazia.");
        }

        Node node = search(root, value);

        if (node == null) {
            throw new DadoNaoEncontradoException("O Valor não foi encontrado na arvore.");
        }

        return node;
    }

    public boolean insert(int value) throws NumeroInvalidoException {
        if (root == null) {
            root = new Node(value);
            return true;
        }

        try {
            search(value);
            throw new NumeroInvalidoException("O Valor ja existe na arvore.");
        } catch (DadoNaoEncontradoException ex) {
            Node current = root;
            Node aux = null;

            while (current != null) {
                aux = current;
                if (current.getContent() > value) {

                    current = current.getLeft();
                } else {
                    current = current.getRight();
                }
            }

            if (aux.getContent() > value) {
                Node newNo = new Node(value);
                aux.setLeft(newNo);
            } else {
                Node newNo = new Node(value);
                aux.setRight(newNo);
            }

        } catch (EstruturaVaziaException ex) {
        }

        return true;
    }

    private void preOrder(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        list.add(node.getContent());
        preOrder(node.getLeft(), list);
        preOrder(node.getRight(), list);

    }

    public ArrayList<Integer> preOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    private void inOrder(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        preOrder(node.getLeft(), list);
        list.add(node.getContent());
        preOrder(node.getRight(), list);
    }

    public ArrayList<Integer> inOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }

    private void posOrder(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        preOrder(node.getLeft(), list);
        preOrder(node.getRight(), list);
        list.add(node.getContent());
    }

    public ArrayList<Integer> posOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        posOrder(root, list);
        return list;
    }
    
    
    
    public ArrayList<Integer> byLevel() {
        ArrayList<Integer> list = new ArrayList<>();
        
        ArrayList<Node> nodes = new ArrayList<>();
       if(root != null){
           nodes.add(root);
       }
       Node aux;
        
        while(!nodes.isEmpty()) {
            aux = nodes.remove(0);
            list.add(aux.getContent());
            if(aux.getLeft() != null) {
                nodes.add(aux.getLeft());
            }
            if(aux.getRight() != null){
                 nodes.add(aux.getRight());
            }
        }
        
        return list;
    }

    public void showTree(int scale) {
        int maxLevel = maxLevel(root);
        Container cont = new Container();
        printNodeInternal(Collections.singletonList(root), 1, maxLevel, cont, scale);
        cont.setLayout(new GridLayout(0, 1));
        cont.setBackground(new Color(195, 195, 210));
        JPanel panel = new JPanel();
        panel.add(cont);
        panel.setBackground(new Color(195, 195, 210));
        int sVerticalValue = pane.getVerticalScrollBar().getValue();
        int hVerticalValue = pane.getHorizontalScrollBar().getValue();
        pane.getViewport().setView(panel);
        pane.getVerticalScrollBar().setValue(sVerticalValue);
        pane.getHorizontalScrollBar().setValue(hVerticalValue);
        pane.getViewport().setView(panel);

    }

    public void showTree(int scale, int value) {
        int maxLevel = maxLevel(root);
        Container cont = new Container();
        printNodeInternal(Collections.singletonList(root), 1, maxLevel, value, cont, scale);
        cont.setLayout(new GridLayout(0, 1));
        cont.setBackground(new Color(195, 195, 210));

        JPanel panel = new JPanel();
        panel.add(cont);
        panel.setBackground(new Color(195, 195, 210));
        int sVerticalValue = pane.getVerticalScrollBar().getValue();
        int hVerticalValue = pane.getHorizontalScrollBar().getValue();
        pane.getViewport().setView(panel);
        pane.getVerticalScrollBar().setValue(sVerticalValue);
        pane.getHorizontalScrollBar().setValue(hVerticalValue);
        pane.getViewport().setView(panel);
    }

    private void printNodeInternal(List<Node> nodes, int level, int maxLevel, int value, Container cont, int scale) {
        if (nodes.isEmpty() || isAllElementsNull(nodes)) {
            return;
        }
        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;
        JPanel pnl = new JPanel();
        pnl.setLayout(new BoxLayout(pnl, BoxLayout.X_AXIS));
        printWhitespaces(firstSpaces, pnl, scale);

        List<Node> newNodes = new ArrayList<>();
        for (Node node : nodes) {
            NoGrafico element;
            if (node != null) {
                int nodeValue = node.getContent();

                if (nodeValue == value) {
                    element = new NoGrafico("" + nodeValue, scale, true);
                } else {
                    element = new NoGrafico("" + nodeValue, scale, false);
                }

                newNodes.add(node.getLeft());
                newNodes.add(node.getRight());
                pnl.add(element);
            } else {
                pnl.add(new Espaco(scale));
                newNodes.add(null);
                newNodes.add(null);
            }

            printWhitespaces(betweenSpaces, pnl, scale);
        }
        cont.add(pnl);

        for (int i = 1; i <= endgeLines; i++) {
            pnl = new JPanel();
            pnl.setLayout(new BoxLayout(pnl, BoxLayout.X_AXIS));
            for (int j = 0; j < nodes.size(); j++) {
                printWhitespaces(firstSpaces - i, pnl, scale);
                if (nodes.get(j) == null) {
                    printWhitespaces(endgeLines + endgeLines + i + 1, pnl, scale);
                    continue;
                }
                if (nodes.get(j).getLeft() != null) {
                    Seta arrow = new Seta(scale, true);
                    pnl.add(arrow);
                } else {
                    printWhitespaces(1, pnl, scale);
                }
                printWhitespaces(i + i - 1, pnl, scale);

                if (nodes.get(j).getRight() != null) {
                    Seta arrow = new Seta(scale, false);
                    pnl.add(arrow);
                } else {
                    printWhitespaces(1, pnl, scale);
                }
                printWhitespaces(endgeLines + endgeLines - i, pnl, scale);
            }
            cont.add(pnl);
        }
        printNodeInternal(newNodes, level + 1, maxLevel, value, cont, scale);
    }

    private void printNodeInternal(List<Node> nodes, int level, int maxLevel, Container cont, int scale) {
        if (nodes.isEmpty() || isAllElementsNull(nodes)) {
            return;
        }
        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;
        JPanel pnl = new JPanel();
        pnl.setLayout(new BoxLayout(pnl, BoxLayout.X_AXIS));
        printWhitespaces(firstSpaces, pnl, scale);

        List<Node> newNodes = new ArrayList<>();
        for (Node node : nodes) {
            NoGrafico element;
            if (node != null) {
                element = new NoGrafico("" + node.getContent(), scale, false);
                newNodes.add(node.getLeft());
                newNodes.add(node.getRight());
                pnl.add(element);
            } else {
                pnl.add(new Espaco(scale));
                newNodes.add(null);
                newNodes.add(null);
            }

            printWhitespaces(betweenSpaces, pnl, scale);
        }
        pnl.setBackground(new Color(195, 195, 210));
        cont.add(pnl);

        for (int i = 1; i <= endgeLines; i++) {
            pnl = new JPanel();
            pnl.setLayout(new BoxLayout(pnl, BoxLayout.X_AXIS));
            for (int j = 0; j < nodes.size(); j++) {
                printWhitespaces(firstSpaces - i, pnl, scale);
                if (nodes.get(j) == null) {
                    printWhitespaces(endgeLines + endgeLines + i + 1, pnl, scale);
                    continue;
                }
                if (nodes.get(j).getLeft() != null) {
                    Seta arrow = new Seta(scale, true);
                    pnl.add(arrow);
                } else {
                    printWhitespaces(1, pnl, scale);
                }
                printWhitespaces(i + i - 1, pnl, scale);

                if (nodes.get(j).getRight() != null) {
                    Seta arrow = new Seta(scale, false);
                    pnl.add(arrow);
                } else {
                    printWhitespaces(1, pnl, scale);
                }
                printWhitespaces(endgeLines + endgeLines - i, pnl, scale);
            }
            pnl.setBackground(new Color(195, 195, 210));
            cont.add(pnl);
        }
        printNodeInternal(newNodes, level + 1, maxLevel, cont, scale);
    }

    private void printWhitespaces(int count, JPanel pnl, int scale) {
        for (int i = 0; i < count; i++) {
            pnl.add(new Espaco(scale));
            pnl.setBackground(new Color(195, 195, 210));
        }
    }

    private int maxLevel(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(maxLevel(node.getLeft()), maxLevel(node.getRight())) + 1;
    }

    private boolean isAllElementsNull(List<Node> list) {
        return list.stream().noneMatch((node) -> (node != null));
    }
}
