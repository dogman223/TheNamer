package Main;

import java.util.Scanner;

public class QuestionDrawer {
    public static void Question() {
        System.out.println("What kind of word do you need?");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

            switch (word) {
                case "default" -> System.out.println(Name.NameGiver());
                case "double word" -> {
                    System.out.print(Name.NameGiver() + " ");
                    System.out.println(Name.NameGiver());
                }
                case "triple word" -> {
                    System.out.print(Name.NameGiver() + " ");
                    System.out.print(Name.NameGiver() + " ");
                    System.out.println(Name.NameGiver());
                }
                case "name" -> {
                    System.out.println(Name.NameGiver());
                }
                case "surname" -> {
                    System.out.println("Which ethnicity of surname do you need?");
                    String surnameEthnicity = scanner.nextLine();
                    switch (surnameEthnicity) {
                        case "polish" -> {
                            String[] polishSurname = {"SKI", "CKI", "DZKI"};
                            int polish = (int) (Math.random() * polishSurname.length);
                            System.out.println(Name.NameGiver() + polishSurname[polish]);
                        }
                        case "jewish" -> {
                            String[] jewishSurname = {"STEIN", "MAN"};
                            int jewish = (int) (Math.random() * jewishSurname.length);
                            System.out.println(Name.NameGiver() + jewishSurname[jewish]);
                        }
                        case "english" -> {
                            String[] englishSurname = {"TON", "FORD", "SAY", "WAY"};
                            int english = (int) (Math.random() * englishSurname.length);
                            System.out.println(Name.NameGiver() + englishSurname[english]);
                        }
                        case "spanish" -> {
                            String[] spanishSurname = {"AS", "OS", "EZ"};
                            int spanish = (int) (Math.random() * spanishSurname.length);
                            System.out.println(Name.NameGiver() + spanishSurname[spanish]);
                        }
                        case "ukrainian" -> {
                            String[] ukrainianSurname = {"KO"};
                            int ukrainian = (int) (Math.random() * ukrainianSurname.length);
                            System.out.println(Name.NameGiver() + ukrainianSurname[ukrainian]);
                        }
                        case "czech" -> {
                            String[] czechSurname = {"CEK"};
                            int czech = (int) (Math.random() * czechSurname.length);
                            System.out.println(Name.NameGiver() + czechSurname[czech]);
                        }
                        case "serbian" -> {
                            String[] serbianSurname = {"IĆ"};
                            int serbian = (int) (Math.random() * serbianSurname.length);
                            System.out.println(Name.NameGiver() + serbianSurname[serbian]);
                        }
                        case "russian" -> {
                            String[] russianSurname = {"OW"};
                            int russian = (int) (Math.random() * russianSurname.length);
                            System.out.println(Name.NameGiver() + russianSurname[russian]);
                        }
                        case "german" -> {
                            String[] germanSurname = {"ER", "EL", "MANN"};
                            int german = (int) (Math.random() * germanSurname.length);
                            System.out.println(Name.NameGiver() + germanSurname[german]);
                        }
                        case "scandinavian" -> {
                            String[] scandinavianSurname = {"SON"};
                            int scandinavian = (int) (Math.random() * scandinavianSurname.length);
                            System.out.println(Name.NameGiver() + scandinavianSurname[scandinavian]);
                        }
                        case "japanese" -> {
                            String[] japaneseSurname = {"UKU", "NO", "OTO", "SHI"};
                            int japanese = (int) (Math.random() * japaneseSurname.length);
                            System.out.println(Name.NameGiver() + japaneseSurname[japanese]);
                        }
                    }
                }
                case "city" -> {
                    String[] cities = {"ŃSK", "ÓW", "BURG", "TOWN", "VILLE", "HOLM"};
                    int city = (int) (Math.random() * cities.length);
                    System.out.println(Name.NameGiver() + cities[city]);
                }
                case "double worded city" -> {
                    String[] cities = {"ŃSK", "ÓW", "BURG", "TOWN", "VILLE", "HOLM"};
                    int city = (int) (Math.random() * cities.length);
                    System.out.print("NEW ");
                    System.out.println(Name.NameGiver() + cities[city]);
                }
                case "triple worded city" -> {
                    String[] cities = {"ŃSK", "ÓW", "BURG", "TOWN", "VILLE", "HOLM"};
                    int city = (int) (Math.random() * cities.length);
                    System.out.print("FREE CITY ");
                    System.out.println(Name.NameGiver() + cities[city]);
                }
                case "dinosaur" -> {
                    String[] dinosaurs = {"SAURUS", "ODON", "ATOR", "OPS", "ULUS"};
                    int dinosaur = (int) (Math.random() * dinosaurs.length);
                    System.out.println(Name.NameGiver() + dinosaurs[dinosaur]);
                }
                case "plant" -> {
                    String[] plants = {"ILIA", "US", "IX", "EX", "ES"};
                    int plant = (int) (Math.random() * plants.length);
                    System.out.println(Name.NameGiver() + plants[plant]);
                }
                case "insect" -> {
                    String[] insects = {"US", "UX", "IX", "ECT", "EX"};
                    int insect = (int) (Math.random() * insects.length);
                    System.out.println(Name.NameGiver() + insects[insect]);
                }
                case "country" -> {
                    String[] countries = {"LAND", " ISLANDS", " FEDERATION", " EMPIRE", " REPUBLIC", " CONFEDERATION", " KINGDOM", " DUCHY"};
                    int country = (int) (Math.random() * countries.length);
                    System.out.println(Name.NameGiver() + countries[country]);
                }
                case "region" -> {
                    String[] regions = {"ANIA", "WOOD"};
                    int region = (int) (Math.random() * regions.length);
                    System.out.println(Name.NameGiver() + regions[region]);
                }
                case "title" -> {
                    String[] titles = {"KING", "GRAND DUKE", "GRAND CHANCELLOR", "PRESIDENT", "MAJOR", "IMPERATOR", "GENERAL"};
                    int title = (int) (Math.random() * titles.length);
                    System.out.print(titles[title] + " ");
                    System.out.println(Name.NameGiver());
                }
            }
    }
    }
