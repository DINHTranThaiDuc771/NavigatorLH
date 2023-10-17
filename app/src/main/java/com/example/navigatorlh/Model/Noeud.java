package com.example.navigatorlh.Model;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;

import java.util.Iterator;
import java.util.stream.Stream;

public class Noeud implements Node {
    @Override
    public Graph getGraph() {
        return null;
    }

    @Override
    public int getDegree() {
        return 0;
    }

    @Override
    public int getOutDegree() {
        return 0;
    }

    @Override
    public int getInDegree() {
        return 0;
    }

    @Override
    public Edge getEdgeToward(String s) {
        return null;
    }

    @Override
    public Edge getEdgeFrom(String s) {
        return null;
    }

    @Override
    public Edge getEdgeBetween(String s) {
        return null;
    }

    @Override
    public Edge getEdge(int i) {
        return null;
    }

    @Override
    public Edge getEnteringEdge(int i) {
        return null;
    }

    @Override
    public Edge getLeavingEdge(int i) {
        return null;
    }

    @Override
    public Iterator<Node> getBreadthFirstIterator() {
        return null;
    }

    @Override
    public Iterator<Node> getBreadthFirstIterator(boolean b) {
        return null;
    }

    @Override
    public Iterator<Node> getDepthFirstIterator() {
        return null;
    }

    @Override
    public Iterator<Node> getDepthFirstIterator(boolean b) {
        return null;
    }

    @Override
    public Stream<Edge> edges() {
        return null;
    }

    @Override
    public Edge getEdgeToward(Node node) {
        return null;
    }

    @Override
    public Edge getEdgeToward(int i) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public Edge getEdgeFrom(Node node) {
        return null;
    }

    @Override
    public Edge getEdgeFrom(int i) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public Edge getEdgeBetween(Node node) {
        return null;
    }

    @Override
    public Edge getEdgeBetween(int i) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public Object getAttribute(String s) {
        return null;
    }

    @Override
    public Object getFirstAttributeOf(String... strings) {
        return null;
    }

    @Override
    public <T> T getAttribute(String s, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> T getFirstAttributeOf(Class<T> aClass, String... strings) {
        return null;
    }

    @Override
    public boolean hasAttribute(String s) {
        return false;
    }

    @Override
    public boolean hasAttribute(String s, Class<?> aClass) {
        return false;
    }

    @Override
    public Stream<String> attributeKeys() {
        return null;
    }

    @Override
    public void clearAttributes() {

    }

    @Override
    public void setAttribute(String s, Object... objects) {

    }

    @Override
    public void removeAttribute(String s) {

    }

    @Override
    public int getAttributeCount() {
        return 0;
    }
}
