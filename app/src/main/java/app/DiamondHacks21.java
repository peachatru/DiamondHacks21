package app;
import java.util.*;
import java.util.ArrayList;
/**
 * This will be the start of our program!
 * @version 1.0
 * @author Nyela Allen
 * @author Olivia Carson
 * @author Michael Smith
 * @author Tiffany Truong
 */
public class DiamondHacks21 {
    /*
    * Links and Resources Used!!!
    * https://www.blackpast.org/african-american-history/national-black-feminist-organization-1973-1976/
    * https://newsinfo.inquirer.net/1410711/6-year-old-boy-arrested-for-picking-flower-at-bus-stop
    * https://www.theguardian.com/us-news/2021/mar/23/deb-haaland-swearing-in-skirt-dress-agnes-woodward
    * https://www.history.com/topics/india/salt-march
    * https://en.wikipedia.org/wiki/Diane_Humetewa
    * https://www.aljazeera.com/news/2021/3/8/thousands-of-indian-women-join-farmers-protests-against-new-laws
    * https://www.cnn.com/2021/03/24/asia/myanmar-protests-7-year-old-killed-intl-hnk/index.html
    * https://www.independent.co.uk/news/after-silence-strike-myanmar-protests-again-met-with-force-myanmar-protesters-aung-san-suu-kyi-yangon-karen-b1822201.html
    * https://en.wikipedia.org/wiki/Women%27s_liberation_movement_in_Asia
    * https://www.theguardian.com/global-development/2021/mar/09/mexico-protests-against-attacks-on-women-turn-violent-as-tension-with-president-escalates
    * https://www.hawaiinewsnow.com/2021/03/27/kauai-instructor-accused-child-sex-crimes-was-also-longtime-foster-parent/
    * https://www.history.com/this-day-in-history/philippine-independence-declared
    * https://www.aljazeera.com/news/2021/3/10/un-urges-probe-into-killings-of-philippine-activists
    * https://thebutlercollegian.com/2015/02/history-of-butler-sigma-gamma-rho
    * https://www.nps.gov/articles/000/dawes-act.htm#:~:text=The%20Dawes%20Act%20(sometimes%20called,to%20break%20up%20tribal%20lands.
    * https://www.blacknews.com/news/legend-smalls-one-year-old-boy-shot-head-houston-police/
    * https://abcnews.go.com/alerts/race-in-america
    * https://www.nytimes.com/2020/05/31/us/george-floyd-investigation.html
    * https://www.theguardian.com/environment/2021/feb/20/native-americans-rebuild-lost-territories-real-estate
    * https://www.theguardian.com/world/india
    * https://www.cnn.com/2021/02/10/asia/india-farmers-protest-explainer-intl-hnk-scli/index.html
    * https://www.inquirer.com/news/philadelphia/stop-asian-hate-rally-philadelphia-chinatown-solidarity-20210326.html
    * https://www.nbcnews.com/news/latino/mexico-women-physically-sexually-abused-participating-protests-rcna373
    * https://www.nbcnews.com/news/us-news/hawaii-telescope-protesters-don-t-back-down-after-arrests-n1031561
    * https://www.hrw.org/news/2020/06/29/philippines-police-crack-down-lgbt-protest
    * https://en.wikipedia.org/wiki/Indian_Rebellion_of_1857
    */
    private static final String HISTORICAL_FACTS = "Past Events";
    private static final String CURRENT_EVENTS = "Current Events";
    private static final String LEARN_MORE = "Learn More";
    private static final String GET_INVOLVED = "Get Involved";

    public String getPastEvent() {
        ArrayList<String> pastEvents = new ArraryList<String>();
        String fact1 = "Founded in May 1973, the National Black Feminist Organization (NBFO) addressed\n" +
        "both the sexism and racism faced by black women. By 1974, there were 2,000 members and 10 chapters\n" +
        "acrooss the United States, a tremondous increase from the original 30 members. While the organization ended in 1980,\n" +
        "it fought hard for changes and also influenced the creation of other organizations.";

        String fact2 = "The Alpha Chapter of Sigma Gamma Rho was founded on November 12, 1922 by seven African America women educators who \n" +
         "believed in fighting injustice and establishing an organization dedicated to supporting fellow black women." +
          "From what started with seven members has expaned to over 500 chapters all over the world promoting leadership, education, and sisterhood.";

        String fact3 = "From 2007 to 2009, Diane Humetewa became the first Native American woman and \n" +
        "enrolled tribal member to serve as a federal judge. She is one of three Native Americans in history\n" +
        " to serve in this position. After her term, she became a professor at Arizona State's Sandra Day O'Connor College of Law.\n" +
        "Along with this she has also served as counsel to the Senate Committee on Indian Affairs, and to the\n" +
        "Deputy Attorney General for the United States Department of Justice.";

        String fact4 = "The Dawes Act of 1887 led to millions of acres of land stolen from Native Americans by the U.S government.\n" +
        "In an effort to assimilate Native Americans into the mainstream culture, they were forced to enroll in the Bureau of Indian Affairs to recieve an allotment of land. \n" +
        "Though only the head of the Native American family could recieve an allotment and often times the land was smaller than what they originally owned. \n" +
        "Furthermore, most of the land surplus was sold to white settlements leading to more forceful assimilation in western Native American regions. ";

        String fact5 = "In april of 1930, Mohandas Gandhi led the Salt March which was an act of disobedience aganist\n" +
        "British rule in India. During the march, thousands of Indians followed Gandhi from Ahmedabad to the Arabian\n" +
        "Sea coast, a distance of 240 miles. The result of this march was an arrest of 60,000 people but with acts like this,\n" +
        "India was granted independence from Britain in 1947.";

        String fact6 = "The Indian Rebellion of 1857 was a mass mutiny led by the sepoys against the British East India Company an envoy of the British rule. \n" +
        "The rebellion becaome more and more of a threat throughout the year until the Britsh eventually gained back control over the territory. \n" +
        "Despite this unsuccessful revolt, there was still animosity between the Indians and the British that would lead to future rebellions and later their indpendence in 1947"

        String fact7 = "From the period of late 1960's to 1970's, the women's liberation movement in Asia\n" +
        "was a feminist movement that sought to redefine women's relationships to the family, and also the way\n" +
        "women expressed their sexuality. This movement also featured particular challenges that made the liberation\n" +
        "movement unique in different countries across Asia. These movements were inspired by previous women's movements\n" +
        "such as in America, but they also inspired multiple new movements in Asia and other non-western countries.";

        String fact8 = "The EDSA Revolution of 1986 were a series of pacifist protests led by Filipino citizens in an effort to fight\n" +
        "against voter fraud and the current regime's dictatorship. This revolution led to the end of ";

        String fact9 = "In 2011, Josefina Vázquez Mota won the nomination for presidency and became the\n" +
        "first female canidate from a major political party in Mexico's history. Not only was she the first female\n" +
        "canidate to be nominated, but she was the least known canidate of the three major parties in Mexico.\n" +
        "While she ended up not winning the presidancy, this was a turning point in Mexico's political history, and in the coming years,\n" +
        "women will have more opportunites to hold major political positions.";

        String fact10 =

        String fact11 = "In early 1891, Lilioukalani ascended to the thrown becoming the first woman, and only, to ever to rule Hawaii.\n" +
        "As queen, Lilioukalani implemented a new constitution that restored the powers lost to the monarchy through the\n" +
        "Bayonet consitution,";

        String fact12 =

        String fact13 = "On July 4th, 1946, full independence was granted to the republic of Philippines by the United States,\n" +
        "and the Philippines became recognized as an independent nation. There is another independence day celebrated on\n" +
        "June 12 that recognizes the day the islands broke free from Spanish rule.";

        pastEvents.add(fact1); // Black
        pastEvents.add(fact2); // Black
        pastEvents.add(fact3); // Indigenous
        pastEvents.add(fact4);// Indigenous
        pastEvents.add(fact5)// India
        pastEvents.add(fact6);// India
        pastEvents.add(fact7);// East/SE Asia
        pastEvents.add(fact8);// East/SE Asia
        pastEvents.add(fact9);// Mexico
        pastEvents.add// Mexico
        pastEvents.add(fact11);// Hawaii and other Pacific Islands
        pastEvents.add// Hawaii and other Pacific Islands
        pastEvents.add(fact13);// the Phillippines
        pastEvents.add// the Phillippines

        // include rande randomrator here for random past event
        Random random = new Random();
        int index = random.nextInt(pastEvents.size() - 1); // Random int from pastEvents array list.

       String randomPastFact = pastEvents.get(index); // yepp your random choice is ready.
       return randomPastFact;
    }

    public String getCurrentEvent() {
        ArrayList<String> currentEvents = new ArraryList<String>();
        String fact1 = "In early March 2021, a six-year-old boy who plucked a tulip while waiting " +
                "at a bus stop in North Carolina was sent\nto juvenile court after being charged with obstruction" +
                " of real property.\nStatistics have shown that roughly 7,300 complaints filed in N.C. were" +
                " actually filed against 6 to 11 year olds\nbetween 2015 and 2018. Of those complaints...\n" +
                "\t- 47% were against Black children\n" + "\t- 40% were against white children\n" +
                "\t- 7% against Hispanic or Latino children\n" + "While a young child ending up before " +
                "a judge may seem bizarre, arrests like this are common in N.C., \nespecially cases that have been" +
                " instigated by racial discrimination in the juvenile justice system.";
        currentEvents.add(fact1); // Black

        String fact2 = "On May 25 2020, George Floyd was arrested after a 911 call where the police" + '\n' +
                "were told that Floyd bought cigaretts with a counterfeit bill. Once the police arrived at the scene," + '\n' +
                "Floyd was  unfairly pinned to the ground, unable to breathe, until he showed no signs of life. ";
        currentEvents.add(fact2); // Black

        String fact3 = "On March 16, 2021, Deb Haaland was sworn in as the 54th United States secretary " +
                "of the interior whilst wearing a traditional\nNative garment adorned with icons that was" +
                " rooted in honoring the community's heritage and symbolized empowerment. Agnes Woodward,\nthe designer" +
                "of the beautiful dress, explained all the positive connotations that comes with the piece." +
                " For instance, the rainbow\ncolors are meant to represent all people while the pair of dark blue butterflies" +
                " are there to offer an uplifting message.\nThe cornstalk was specifically used as decor to symbolize" +
                "Halland's enrolled membership in Pueblo of Laguna, a tribe in New Mexico.";
        currentEvents.add(fact3); // Indigenous

        String fact4 = "Native tribes in the US plan to buy back land that was lost during the colonization period" + '\n' +
                "in order to rebuild territories. For example, in North Carolina, the Cherolee tribe is in the process of buying land" + '\n' +
                "that is considered the most sacred piece of land to all Cherokees";
        currentEvents.add(fact4); // Indigenous

        String fact5 = "To mark International Women's Day, March 8, thousands of women have joined protests by farmers" +
                " on the boundaries of New Delhi,\nIndia to oppose the new agricultural laws passed in September 2020." +
                " A women rights activist Sucharita, who uses one name to\nprotect her privacy, declared that," +
                "\"We are opposed to the laws that have been passed in favour of corporations and private buyers.\"";
        currentEvents.add(fact5); // India

        String fact6 = "Even though farmers are the biggest voter bloc in India, the government has passed new laws that" + '\n' +
                "have angered many farmers. These new laws disregard the previous structure farmers had and allows" + '\n' +
                "famers to sell to buyers at any price. This increased freedom could lead to a monoply in the farming industry," + '\n' +
                "and it is the reason why farmers have left there farms to protest.";
        currentEvents.add(fact6);// India

        String fact7 = "On March 24th in the city of Mandalay, Myanmar protestors have begun to join a 'silent strike' after a " +
                "seven year old child\nwas shot dead as a result from Myanmar's security forces' " +
                "attempts to suppress protests across the country by open firing\non rallies in residential areas. " +
                "Her death marks the youngest victim yet in the military's retaliation on civilian opposition\nto the February 1 coup, which overturned" +
                "a democratic election and established a ruling military junta. At least 275 people have been\nkilled since the coup, " +
                "with roughly 20 of them being children. ";
        currentEvents.add(fact7); // East/SE Asia
        String fact8= "On March 25 2021, hundreds of people from both the Asian American and Pacific Islander communities come together to protest in Philadelphia against" + '\n' +
                "racism within the comunities. Protest are on the rise because of recent events around the mass shootings in Atlata where eight people were killed.";
        currentEvents.add(fact8)// East/SE Asia

        String fact9 = "On March 8, in honor of International Women's day, thousands of women marched to the National Palace in Mexico City\n" +
                "to protest against President Andrés Manuel López Obrador and his support for politicians accused of sexual assault.\nIt soon turned into a " +
                "violent protest as officers began firing pepper spray after the protestors had attempted to tear\ndown a metal wall; which resulted in " +
                "sixty-two officers and nineteen civilians being injured. While the President had\ninstalled this metal barricade and claimed it as a \"peace wall\" " +
                "in advance of the protests, many women accused the\npresident of being fearful of the feminist movement and irgnorant for turning a cold shoulder " +
                "to concerns such as spiking\nsexual violence cases and a daily toll of ten femicides. Official data shows that at least 939 women were victims " +
                "of\nfemicide last year in Mexico.";
        currentEvents.add(fact9); // Mexico

        String fact10 = "On November 9 2020, durring a protest demanding justice for the killing of  Bianca Alejandrina Lorenzana, women protesting were beaten" + '\n'+
                " and sexually assulted for peacful protesting in Mexico. In the past five years the number of gender violnece cases each year increased from 411 to 860." ;
        currentEvents.add(fact10);// Mexico

        String fact11 = "Victor Aguilar, a 65 Kauai instructor, was booked into the Federal Detention Center by agents with " +
                "Homeland Security Investigations\non Thursday, March 25, 2021." +
                "Aguilar was charged with two counts of child exploitation for the purpose of producing child\npornography. " +
                "Kauai prosecutors also charged Aguilar at the state level last month " +
                "for supposedly sexually assaulting a\nformer student at Waimea High School, where he was" +
                " an athletic coach and JROTC instructor since 1995. Furthermore,\nAguilar and his wife fostered about" +
                "40 children and investigators have identified roughly \"1,000 artifacts-- both videos\nand photographs\" of " +
                "the underage victim. Despite the fact that not all of those images qualify as " +
                "child porn, the HSI agent\nwrote that they can confirm the images Aguilar created do qualify.";
        currentEvents.add(fact11); // Hawaii and other Pacific Islands

        String fact12 = "On July 19 2019, protesters in Honolulu Hawaii protest against the addition of a $1.4 billion, that was planned to be built on land" +
                '\n' +" sacred to most Native Hawaiians." ;
        currentEvents.add(fact12)// Hawaii and other Pacific Islands

        String fact13 =  "The United Nations human rights office has faulted the killing of nine activists by" +
                "Philippine police over the weekend of March 6,\n2021 and urged the government of President Rodrigo" +
                "Duterte to investigate the incident, as his national security advisor confirmed\na \"shoot-on-sight\" order against the activists. " +
                "Ravina Shamdasani, a spokesperson for the UN High Commissioner for Human Rights\nhad also expressed their concenrs by saying,\"We" +
                " are deeply worried that these latest killings indicate an escalation of violence...\n\'red tagging\' " +
                "of human rights defenders.\n" + "\t-\'Red-tagging\' essentially refers to government and military efforts to label" +
                " anyone critical of human or labour rights\n\tabuses as a communist.";
        currentEvents.add(fact13); // the Phillippines
        String fact14 = "Police arrest and use violence against peaceful protesters in an LBGTQ pride event in Manila, Philipenes on June 26, 2020" + '\n' +
                "The police's only explanation was that the protesters actions were \"prohibited by law\", " + '\n' +
                "and protesters argued that they were following the social distancing protocols put into place because of COVID."+ '\n' +
                " The protesters had the right to peacful protest but the police at the protest took that awat from them.";

        currentEvents.add(fact14);// the Phillippines

        // include random generator here for random past event
        Random random = new Random();
        int index = random.nextInt(currentEvents.size() - 1); // Random int from pastEvents array list.

        String randomCurrentFact = currentEvents.get(index); // choose a random fact for user
        return randomCurrentFact;
        }

        public String getMoreResources() {
        ArrayList<String> websitesWithInformation = new ArraryList<String>();
        websitesWithInformation.add("https://www.blackpast.org/") //enter website url
        websitesWithInformation.add("https://www.history.com/topics/native-american-history"); //enter website url
        websitesWithInformation.add("https://newsinfo.inquirer.net/1410711/6-year-old-boy-arrested-for-picking-flower-at-bus-stop"); //enter website url
        websitesWithInformation.add("https://www.theguardian.com/us-news/2021/mar/23/deb-haaland-swearing-in-skirt-dress-agnes-woodward"); //enter website url
        websitesWithInformation.add("https://www.history.com/topics/india/salt-march"); //enter website url
        websitesWithInformation.add("https://en.wikipedia.org/wiki/Diane_Humetewa");//enter website url
        websitesWithInformation.add("https://www.aljazeera.com/news/2021/3/8/thousands-of-indian-women-join-farmers-protests-against-new-laws");//enter website url
        websitesWithInformation.add("https://www.cnn.com/2021/03/24/asia/myanmar-protests-7-year-old-killed-intl-hnk/index.html");//enter website url
        websitesWithInformation.add("https://www.independent.co.uk/news/after-silence-strike-myanmar-protests-again-met-with-force-myanmar-protesters-aung-san-suu-kyi-yangon-karen-b1822201.html");//enter website url
        websitesWithInformation.add("https://en.wikipedia.org/wiki/Women%27s_liberation_movement_in_Asia");//enter website url
        websitesWithInformation.add("https://www.theguardian.com/global-development/2021/mar/09/mexico-protests-against-attacks-on-women-turn-violent-as-tension-with-president-escalates");//enter website url
        websitesWithInformation.add("https://www.hawaiinewsnow.com/2021/03/27/kauai-instructor-accused-child-sex-crimes-was-also-longtime-foster-parent/");//enter website url
        websitesWithInformation.add("https://www.history.com/this-day-in-history/philippine-independence-declared");//enter website url
        websitesWithInformation.add("https://www.aljazeera.com/news/2021/3/10/un-urges-probe-into-killings-of-philippine-activists");//enter website url
        websitesWithInformation.add("https://www.learningforjustice.org/magazine/what-is-the-model-minority-myth");
        websitesWithInformation.add("https://thebutlercollegian.com/2015/02/history-of-butler-sigma-gamma-rho");
        websitesWithInformation.add("https://www.nps.gov/articles/000/dawes-act.htm#:~:text=The%20Dawes%20Act%20(sometimes%20called,to%20break%20up%20tribal%20lands.");
        websitesWithInformation.add("https://www.blacknews.com/news/legend-smalls-one-year-old-boy-shot-head-houston-police/");
        websitesWithInformation.add("https://abcnews.go.com/alerts/race-in-america");
        websitesWithInformation.add("https://www.nytimes.com/2020/05/31/us/george-floyd-investigation.html");
        websitesWithInformation.add("https://www.theguardian.com/environment/2021/feb/20/native-americans-rebuild-lost-territories-real-estate");
        websitesWithInformation.add("https://www.theguardian.com/world/india");
        websitesWithInformation.add("https://www.cnn.com/2021/02/10/asia/india-farmers-protest-explainer-intl-hnk-scli/index.html");
        websitesWithInformation.add("https://www.inquirer.com/news/philadelphia/stop-asian-hate-rally-philadelphia-chinatown-solidarity-20210326.html");
        websitesWithInformation.add("https://www.nbcnews.com/news/latino/mexico-women-physically-sexually-abused-participating-protests-rcna373");
        websitesWithInformation.add("https://www.nbcnews.com/news/us-news/hawaii-telescope-protesters-don-t-back-down-after-arrests-n1031561");
        websitesWithInformation.add("https://www.hrw.org/news/2020/06/29/philippines-police-crack-down-lgbt-protest");
        websitesWithInformation.add("https://colorofchange.org/");

        // include random generator here for random past event
        Random random = new Random();
        int index = random.nextInt(websiteWithInformation.size() - 1); // Random int from pastEvents array list.

        String websiteForUser = websiteWithInformation.get(index); // choose a random link for user
        return websiteForUser;
        }

    public String getInvolved() {
        ArrayList<String> beInvolvedActivities = new ArraryList<String>();
        // we can provide local businesses to support, petitions to sign, books written by POCs to read,
        // etc.
        String book1 = "Book Recommendation!\n" + "\t-Title: \"When They Call You a Terrorist\"\n" +
                        "\t-Author(s): Patrisse Khan-Culler and Asha Bandele, two of the founders of the " +
                          "Black Lives Matter Movement.\n" + "\t-Synopsis: The story pivots around the reason" +
                            " behind the BLM movements and why it's important for marginalized communities to get involved.\n" +
                            "\t-Where to Buy: https://smile.amazon.com/When-They-Call-You-Terrorist/dp/1250171083/ref=smi_www_rco2" +
                                    "_go_smi_g4368549507?_encoding=UTF8&%2AVersion%2A=1&%2Aentries%2A=0&ie=UTF8\n";

        beInvolvedActivities.add("Organization: Black Youth Project\n" + "url: http://blackyouthproject.com/");
        beInvolvedActivities.add("Organization: American Civil Liberties Union\n" + "url: https://www.aclu.org/");
        beInvolvedActivities.add(book1);

        String book2 = "Book Recommendation!\n" + "\t-Title: \"I Am Not Your Perfect Mexican Daughter\"\n" +
                "\t-Author: Erika L. Sanchez, an award winning poet and author\n" + "\t-Synopsis: The story is told from the perspectives" +
                " of two sisters raised in the same family with vastly different\n\t\taspirations on who they want to be. The novel explores what" +
                " it means to be mexican and the cultural norms\n\t\tand expectations that many mexican families hold firmly.\n" +
                "\t-Where to Buy: https://www.amazon.com/Not-Your-Perfect-Mexican-Daughter/dp/1524700487\n";

        beInvolvedActivities.add("Organization: Kids In Need Of Defense (KIND)\n" + "url: https://supportkind.org/");
        beInvolvedActivities.add("Organization: Adavancement Project\n" + "url: https://advancementproject.org/");
        beInvolvedActivities.add("Organization: Color Of Change\n" + "url: https://colorofchange.org/");
        beInvolvedActivities.add(book2);
        beInvolvedActivities.add("Organization: Live Free USA\n" + "url: http://www.livefreeusa.org/#allroads");
        beInvolvedActivities.add("Organization: Black Lives Matter\n" + "https://blacklivesmatter.com/")

        String book3 = "Book Recommendation!\n" + "\t-Title: \"The Bluest Eye\"\n" +
                "\t-Author: Toni Morrison, an American Novelist who received the Nobel Prize for Literature in 1993.\n" +
                "\t-Synopsis: Takes place in the Midwest post-WWI, and portrays such a raw examination of the experiences\n\t\tBlack women in America" +
                " had to face and emphasizes on motifs such as what it means to be beautiful. The themes\n\t\tare still so vivid and " +
                " resonates with many individuals especially in today's racial climate.\n" +
                "\t-Where to Buy: https://www.amazon.com/Bluest-Eye-Vintage-International/dp/0307278441\n";
        beInvolvedActivities.add("Websites for a multitude of petitions: change.org, iPetitions");
        beInvolvedActivities.add(book3);

        String localShop1 = "Local Business Check!\n" + "Support your local artists by buying some of their" +
                " enamel pins!\n100% of proceeds will be donated to the National Association for the Advancement of Colored People (NAACP).\n" +
                "\t-Website: https://www.appleminte.com/products/black-lives-matter-charity-pin?variant=32488344420430\n";
        beInvolvedActivities.add(localShop1);
        beInvolvedActivities.add("Research Organization: https://www.asianwomenforhealth.org/all-of-us-research-program.html");
        beInvolvedActivities.add("A Document provided by Wongfu Productions on Anti-Racism Resources:  bit.ly/ANTIRACISMRESOURCES\n");

        // include rande randomrator here for random past event
        Random random = new Random();
        int index = random.nextInt(beInvolvedActivities.size() - 1); // Random int from pastEvents array list.

        String involvedActivity = beInvolvedActivities.get(index); // choose a random link for user
        return involvedActivity;
    }

    // pastEvents will include 10-15 incidents/trials/events that occurred in the past
    // currentEvents will include 10-15 incidents that occurred during this year
    // other is websites and resources to learn more about
    // "how to get involved" : petitions, local businesses, book recomm
    public static void main(String[] args) {
        System.out.println("\t\tWelcome to the [insert app name]!\t\t");
        System.out.print("In light of recent events and rising hate crimes against POCs, our team" +
                "wanted to create a program that would\nserve as a resource to stay informed and stay engaged to combat" +
                "social issues across the globe.");
        String userChoice;
        Scanner scnr = new Scanner(System.in);
        Boolean runningProgram = true;

        while (runningProgram == true) {
            System.out.println("\t\t Please chose your option choice from the choices below!!!\t\t");
            System.out.println(" ");
            System.out.println("For past events please enter \"p\"");
            System.out.println("For current events please enter \"c\"");
            System.out.println("To receive websites and resources to learn more please enter \"l\"");
            System.out.println("If you want to get involved and be directed to helpful resources please enter \"i\"");
            System.out.println("If you want to quit the program please enter \"q\"");
            System.out.println(" ");
            System.out.print("Choice: ");
            userChoice = scnr.next();
            char optionChoice = userChoice.charAt(0);
            System.out.print(" ");

            switch (optionChoice.toLowerCase()) {
                case 'p':
                    System.out.println("Here is an event from the past!");
                    System.out.println(getPastEvent());
                    break;

                case 'c':
                    System.out.println("Here is a current event!");
                    System.out.println(getCurrentEvent());
                    break;

                case 'l':
                    System.out.println("Here is a url to a resource with more information!");
                    System.out.println(getMoreResources());
                    break;

                case 'g':
                    System.out.println("Here are some resources to help you get involved!");
                    System.out.println(getInvolved());
                    break;

                case 'q':
                    System.exit(0);

                default:
                    System.out.println("Please enter a valid input!");
                    break;
            }
            }

    }
}