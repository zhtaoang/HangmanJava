package com.hangman.players;

import com.hangman.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class YourPlayer implements Player {


    Character[] charArr = {'e', 't', 'a', 'o', 'i', 'n', 's', 'h', 'r', 'd', 'l', 'u',
            'b', 'c', 'f', 'g', 'j', 'k', 'm', 'p', 'q', 'u', 'v', 'w', 'x', 'y', 'z'};

    int count = 0;
    int length = 0;

    List<Character> guessed = new ArrayList<>();

    @Override // method 1
    public char getGuess(List<Character> currentClue) {

        length = currentClue.size();
        count ++;
        for (Character ch : charArr){
            if (currentClue.contains(ch) || guessed.contains(ch)){
                continue;
            } else {
                guessed.add(ch);
                return ch;
            }
        }
        return '_';
    }

//    @Override // TODO method 2
//    public char getGuess(List<Character> currentClue) {
//
//        length = currentClue.size();
//        count ++;
//        for (Character ch : charArr){
////            System.err.println(count + " : " + ch + " length: " + length);length;
//            if (currentClue.contains(ch) || guessed.contains(ch) || count < 8){
//                continue;
//            } else if (count < 8){
//                guessed.add(ch);
//                return ch;
//            } else {
//                List<String> listOfWords = Arrays.asList(words);
//                List<String > possibleWords = listOfWords.stream().filter(a -> a.length()==length).collect(Collectors.toList());
//                getTheNextLetter(possibleWords, guessed);
//            }
//        }
//        return '_';
//    }
//
//    public Character getTheNextLetter(List<String> possibleWords, List<Character> guessed){
//        //this is to check the max matching word, and return the rest of its chars
//        return '_';
//    }
//
//    static final String words[] = {
//            "aboard",
//            "accept",
//            "accident",
//            "accurate",
//            "acres",
//            "active",
//            "actual",
//            "additional",
//            "adjective",
//            "adult",
//            "adventure",
//            "advice",
//            "affect",
//            "Alice",
//            "alphabet",
//            "announced",
//            "anybody",
//            "apartment",
//            "applied",
//            "appropriate",
//            "April",
//            "arrange",
//            "arrangement",
//            "arrive",
//            "atom",
//            "attempt",
//            "August",
//            "Australia",
//            "Autumn",
//            "aware",
//            "badly",
//            "Bay",
//            "bee",
//            "behavior",
//            "belt",
//            "bend",
//            "bet",
//            "birth",
//            "bite",
//            "blind",
//            "border",
//            "bound",
//            "brass",
//            "breathe",
//            "breeze",
//            "brick",
//            "brief",
//            "buried",
//            "calm",
//            "camera",
//            "canal",
//            "captured",
//            "Casey",
//            "cast",
//            "castle",
//            "chamber",
//            "characteristic",
//            "chose",
//            "claws",
//            "coach",
//            "Columbus",
//            "command",
//            "compass",
//            "consonant",
//            "constantly",
//            "contrast",
//            "cookies",
//            "crack",
//            "curve",
//            "customs",
//            "damage",
//            "Daniel",
//            "Danny",
//            "David",
//            "dawn",
//            "declared",
//            "deeply",
//            "definition",
//            "depth",
//            "diameter",
//            "difficulty",
//            "dirty",
//            "discussion",
//            "dish",
//            "doll",
//            "Don",
//            "donkey",
//            "driven",
//            "dug",
//            "dull",
//            "duty",
//            "eager",
//            "earn",
//            "Eddy",
//            "Egypt",
//            "eleven",
//            "Ellen",
//            "engineer",
//            "equally",
//            "equator",
//            "essential",
//            "eventually",
//            "exchange",
//            "exist",
//            "explanation",
//            "explore",
//            "facing",
//            "fairly",
//            "fewer",
//            "fierce",
//            "fifth",
//            "film",
//            "finest",
//            "fireplace",
//            "firm",
//            "fix",
//            "flame",
//            "floating",
//            "Florida",
//            "folks",
//            "former",
//            "fort",
//            "forty",
//            "fox",
//            "Fred",
//            "frog",
//            "fully",
//            "garage",
//            "gasoline",
//            "gift",
//            "goose",
//            "grabbed",
//            "grade",
//            "grandmother",
//            "gravity",
//            "Greece",
//            "guard",
//            "gulf",
//            "habit",
//            "halfway",
//            "handsome",
//            "hang",
//            "happily",
//            "harbor",
//            "Harry",
//            "hay",
//            "he'll",
//            "headed",
//            "heading",
//            "hello",
//            "herd",
//            "hollow",
//            "horn",
//            "hospital",
//            "hunter",
//            "ill",
//            "Illinois",
//            "image",
//            "income",
//            "independent",
//            "industrial",
//            "instant",
//            "interior",
//            "introduced",
//            "January",
//            "Jeff",
//            "Johnson",
//            "Jones",
//            "judge",
//            "jungle",
//            "kids",
//            "label",
//            "labor",
//            "Lee",
//            "limited",
//            "location",
//            "loss",
//            "lucky",
//            "lungs",
//            "machinery",
//            "mad",
//            "magnet",
//            "mainly",
//            "managed",
//            "manufacturing",
//            "Maria",
//            "Mars",
//            "Martin",
//            "mathematics",
//            "melted",
//            "memory",
//            "mental",
//            "military",
//            "mill",
//            "mission",
//            "mistake",
//            "mixture",
//            "monkey",
//            "mood",
//            "Mount",
//            "movie",
//            "mysterious",
//            "nails",
//            "naturally",
//            "nearer",
//            "negative",
//            "neighborhood",
//            "nervous",
//            "Norway",
//            "noted",
//            "nuts",
//            "obtain",
//            "occasionally",
//            "October",
//            "officer",
//            "official",
//            "Ohio",
//            "opinion",
//            "opportunity",
//            "organization",
//            "origin",
//            "ourselves",
//            "owner",
//            "package",
//            "palace",
//            "pale",
//            "passage",
//            "Pennsylvania",
//            "percent",
//            "perfectly",
//            "Philadelphia",
//            "pilot",
//            "plastic",
//            "plates",
//            "pleasure",
//            "plural",
//            "plus",
//            "poet",
//            "poetry",
//            "Pole",
//            "policeman",
//            "porch",
//            "port",
//            "positive",
//            "possibly",
//            "pot",
//            "pour",
//            "powder",
//            "practical",
//            "previous",
//            "pride",
//            "primitive",
//            "principle",
//            "private",
//            "prize",
//            "promised",
//            "properly",
//            "protection",
//            "pupil",
//            "purple",
//            "raw",
//            "reader",
//            "rear",
//            "recall",
//            "refused",
//            "relationship",
//            "remarkable",
//            "remove",
//            "require",
//            "rhyme",
//            "roar",
//            "rocky",
//            "Rome",
//            "rubbed",
//            "rush",
//            "Russia",
//            "Russian",
//            "saddle",
//            "sale",
//            "salmon",
//            "satellites",
//            "satisfied",
//            "scared",
//            "screen",
//            "seldom",
//            "select",
//            "selection",
//            "settle",
//            "shake",
//            "shaking",
//            "shallow",
//            "shelf",
//            "shelter",
//            "shine",
//            "shout",
//            "silly",
//            "simplest",
//            "sink",
//            "slabs",
//            "slave",
//            "slight",
//            "slip",
//            "slope",
//            "soap",
//            "society",
//            "solar",
//            "somebody",
//            "somehow",
//            "species",
//            "specific",
//            "spider",
//            "spin",
//            "split",
//            "sport",
//            "stairs",
//            "stared",
//            "steep",
//            "stems",
//            "stiff",
//            "stock",
//            "stomach",
//            "stove",
//            "stranger",
//            "struggle",
//            "surrounded",
//            "swam",
//            "swept",
//            "swung",
//            "syllable",
//            "tales",
//            "tank",
//            "tape",
//            "thou",
//            "thumb",
//            "thy",
//            "tide",
//            "tightly",
//            "Tim",
//            "tobacco",
//            "torn",
//            "toy",
//            "trace",
//            "trap",
//            "treated",
//            "tribe",
//            "troops",
//            "tropical",
//            "trunk",
//            "tune",
//            "TV",
//            "typical",
//            "unhappy",
//            "universe",
//            "University",
//            "vapor",
//            "vertical",
//            "vessels",
//            "victory",
//            "visitor",
//            "vote",
//            "voyage",
//            "wealth",
//            "weigh",
//            "welcome",
//            "weren't",
//            "whistle",
//            "widely",
//            "Wilson",
//            "wolf",
//            "worried",
//            "wrapped",
//            "writer",
//            "younger",
//            "zero",
//            "zoo"
//    };
}
