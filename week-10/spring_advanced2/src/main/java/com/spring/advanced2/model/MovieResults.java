package com.spring.advanced2.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MovieResults {
    /**
     * page : 1
     * total_results : 10000
     * total_pages : 500
     * results : [{"popularity":130.939,"vote_count":289,"video":false,"poster_path":"/b5XfICAvUe8beWExBz97i0Qw4Qh.jpg","id":612706,"adult":false,"backdrop_path":"/ishzDCZIv9iWfI70nv5E4ZreYUD.jpg","original_language":"en","original_title":"Work It","genre_ids":[35,10402],"title":"Work It","vote_average":8,"overview":"A brilliant but clumsy high school senior vows to get into her late father's alma mater by transforming herself and a misfit squad into dance champions.","release_date":"2020-08-07"},{"popularity":117.367,"vote_count":49,"video":false,"poster_path":"/3eg0kGC2Xh0vhydJHO37Sp4cmMt.jpg","id":531499,"adult":false,"backdrop_path":"/zogWnCSztU8xvabaepQnAwsOtOt.jpg","original_language":"en","original_title":"The Tax Collector","genre_ids":[28,80,18,53],"title":"The Tax Collector","vote_average":6.2,"overview":"David Cuevas is a family man who works as a gangland tax collector for high ranking Los Angeles gang members. He makes collections across the city with his partner Creeper making sure people pay up or will see retaliation. An old threat returns to Los Angeles that puts everything David loves in harm\u2019s way.","release_date":"2020-08-07"},{"popularity":117.58,"vote_count":61,"video":false,"poster_path":"/5MSDwUcqnGodFTvtlLiLKK0XKS.jpg","id":521034,"adult":false,"backdrop_path":"/8PK4X8U3C79ilzIjNTkTgjmc4js.jpg","original_language":"en","original_title":"The Secret Garden","genre_ids":[18,14,10751],"title":"The Secret Garden","vote_average":7.5,"overview":"Mary Lennox is born in India to wealthy British parents who never wanted her. When her parents suddenly die, she is sent back to England to live with her uncle. She meets her sickly cousin, and the two children find a wondrous secret garden lost in the grounds of Misselthwaite Manor.","release_date":"2020-07-08"},{"popularity":105.831,"vote_count":3008,"video":false,"poster_path":"/mb7wQv0adK3kjOUr9n93mANHhPJ.jpg","id":583083,"adult":false,"backdrop_path":"/wO5QSWZPBT71gMLvrRex0bVc0V9.jpg","original_language":"en","original_title":"The Kissing Booth 2","genre_ids":[35,10749],"title":"The Kissing Booth 2","vote_average":8.1,"overview":"With college decisions looming, Elle juggles her long-distance romance with Noah, changing relationship with bestie Lee and feelings for a new classmate.","release_date":"2020-07-24"},{"popularity":95.114,"vote_count":10,"video":false,"poster_path":"/dKjD3DTZjRI3Ipkf7Oz5zAILnwD.jpg","id":659991,"adult":false,"backdrop_path":"/5nRyaVklxyA9OkxqZaPv1KBRqpd.jpg","original_language":"en","original_title":"Made in Italy","genre_ids":[35,18],"title":"Made in Italy","vote_average":5.8,"overview":"A bohemian artist travels from London to Italy with his estranged son to sell the house they inherited from his late wife.","release_date":"2020-08-06"},{"popularity":82.052,"vote_count":393,"video":false,"poster_path":"/jHo2M1OiH9Re33jYtUQdfzPeUkx.jpg","id":385103,"adult":false,"backdrop_path":"/fKtYXUhX5fxMxzQfyUcQW9Shik6.jpg","original_language":"en","original_title":"Scoob!","genre_ids":[12,16,35,10751],"title":"Scoob!","vote_average":7.6,"overview":"In Scooby-Doo\u2019s greatest adventure yet, see the never-before told story of how lifelong friends Scooby and Shaggy first met and how they joined forces with young detectives Fred, Velma, and Daphne to form the famous Mystery Inc. Now, with hundreds of cases solved, Scooby and the gang face their biggest, toughest mystery ever: an evil plot to unleash the ghost dog Cerberus upon the world. As they race to stop this global \u201cdogpocalypse,\u201d the gang discovers that Scooby has a secret legacy and an epic destiny greater than anyone ever imagined.","release_date":"2020-07-08"},{"popularity":84.032,"id":703745,"video":false,"vote_count":157,"vote_average":6.5,"title":"Deep Blue Sea 3","release_date":"2020-07-28","original_language":"en","original_title":"Deep Blue Sea 3","genre_ids":[28,27,878],"backdrop_path":"/hIHtyIYgBqHybOgUdoAmveipuiO.jpg","adult":false,"overview":"Dr. Emma Collins and her team are spending their third summer on the island of Little Happy studying the effect of climate change on the great white sharks who come to the nearby nursery every year to give birth. Along with the last two inhabitants of this former fishing village, their peaceful life is disrupted when a \"scientific\" team led by her ex-boyfriend and marine biologist Richard show up looking for three bull sharks who we soon learn aren't just any bull sharks.","poster_path":"/bKthjUmxjHjvJK8FktFfQdmwP12.jpg"},{"popularity":86.539,"vote_count":26769,"video":false,"poster_path":"/9gk7adHYeDvHkCSEqAvQNLV5Uge.jpg","id":27205,"adult":false,"backdrop_path":"/s3TBrRGB1iav7gFOCNx3H31MoES.jpg","original_language":"en","original_title":"Inception","genre_ids":[28,12,878],"title":"Inception","vote_average":8.3,"overview":"Cobb, a skilled thief who commits corporate espionage by infiltrating the subconscious of his targets is offered a chance to regain his old life as payment for a task considered to be impossible: \"inception\", the implantation of another person's idea into a target's subconscious.","release_date":"2010-07-15"},{"popularity":78.361,"vote_count":72,"video":false,"poster_path":"/vFIHbiy55smzi50RmF8LQjmpGcx.jpg","id":703771,"adult":false,"backdrop_path":"/owraiceOKtSOa3t8sp3wA9K2Ox6.jpg","original_language":"en","original_title":"Deathstroke: Knights & Dragons - The Movie","genre_ids":[28,16],"title":"Deathstroke: Knights & Dragons - The Movie","vote_average":7.1,"overview":"Ten years ago, Slade Wilson-aka the super-assassin called Deathstroke-made a tragic mistake and his wife and son paid a terrible price. Now, a decade later, Wilson's family is threatened once again by the murderous Jackal and the terrorists of H.IV.E. Can Deathstroke atone for the sins of the past-or will his family pay the ultimate price?","release_date":"2020-08-04"},{"popularity":77.023,"vote_count":4,"video":false,"poster_path":"/3maWeldWS9dnUYbgCPXAghjEtDk.jpg","id":414887,"adult":false,"backdrop_path":null,"original_language":"ko","original_title":"마님","genre_ids":[10749],"title":"Madam","vote_average":4.5,"overview":"Ma-nim (Kim Jeong-ah-II) becomes a widow after her husband dies from sickness and she arrives at Bukgando to get remarried. Her new husband is a handsome and wealthy man but he is killed by a Japanese even before she spends a night with him. Ma-nim is alone in the big house once again. Everyone by her husband's side leaves and only the grandfather and slave named Bau are left behind. One day, Ma-nim notices that Bau has a way of staring at her and she is overcome by a strange feeling. She'd to oppress her desires as a woman because of her two short marriages and strict identity. Bau had never made love with a woman before but she didn't mind his gaze on her. The two of them start a forbidden love behind grandfather's back...","release_date":"2015-08-14"},{"popularity":81.452,"vote_count":876,"video":false,"poster_path":"/kjMbDciooTbJPofVXgAoFjfX8Of.jpg","id":516486,"adult":false,"backdrop_path":"/xXBnM6uSTk6qqCf0SRZKXcga9Ba.jpg","original_language":"en","original_title":"Greyhound","genre_ids":[28,18,10752],"title":"Greyhound","vote_average":7.5,"overview":"A first-time captain leads a convoy of allied ships carrying thousands of soldiers across the treacherous waters of the \u201cBlack Pit\u201d to the front lines of WW2. With no air cover protection for 5 days, the captain and his convoy must battle the surrounding enemy Nazi U-boats in order to give the allies a chance to win the war.","release_date":"2020-06-19"},{"popularity":112.867,"vote_count":22,"video":false,"poster_path":"/2NoqvEpApbcnSWFpbHAswOYufSQ.jpg","id":480923,"adult":false,"backdrop_path":"/sUnAK6VaypBQAMrYa9XU8tGcp9X.jpg","original_language":"en","original_title":"Dead Ant","genre_ids":[35,27],"title":"Dead Ant","vote_average":5.2,"overview":"When the 1989 \"one-hit-wonder\" glam-metal band \"Sonic Grave\" embark on a trip to Coachella in hopes of a comeback, their peyote trip pit stop in Joshua Tree incites an \"unworldly\" viscous attack, and they must \"rock\" themselves out of harms way.","release_date":"2017-10-10"},{"popularity":97.391,"vote_count":14250,"video":false,"poster_path":"/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg","id":475557,"adult":false,"backdrop_path":"/n6bUvigpRFqSwmPp1m2YADdbRBc.jpg","original_language":"en","original_title":"Joker","genre_ids":[80,18,53],"title":"Joker","vote_average":8.2,"overview":"During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.","release_date":"2019-10-02"},{"popularity":77.071,"vote_count":19277,"video":false,"poster_path":"/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg","id":299536,"adult":false,"backdrop_path":"/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg","original_language":"en","original_title":"Avengers: Infinity War","genre_ids":[28,12,878],"title":"Avengers: Infinity War","vote_average":8.3,"overview":"As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.","release_date":"2018-04-25"},{"popularity":49.909,"vote_count":44,"video":false,"poster_path":"/8ziUp2q71vCmMgYY2MRCwI3mSs5.jpg","id":628917,"adult":false,"backdrop_path":"/bkJA4J6sddIKwKSi0qepTiDdwvt.jpg","original_language":"en","original_title":"An American Pickle","genre_ids":[35],"title":"An American Pickle","vote_average":5.5,"overview":"An immigrant worker at a pickle factory is accidentally preserved for 100 years and wakes up in modern day Brooklyn. He learns his only surviving relative is his great grandson, a computer coder who he can\u2019t connect with.","release_date":"2020-08-06"},{"popularity":68.585,"vote_count":8752,"video":false,"poster_path":"/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg","id":496243,"adult":false,"backdrop_path":"/ApiBzeaa95TNYliSbQ8pJv4Fje7.jpg","original_language":"ko","original_title":"기생충","genre_ids":[35,18,53],"title":"Parasite","vote_average":8.5,"overview":"All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident.","release_date":"2019-05-30"},{"popularity":72.311,"vote_count":5423,"video":false,"poster_path":"/db32LaOibwEliAmSL2jjDF6oDdj.jpg","id":181812,"adult":false,"backdrop_path":"/SPkEiZGxq5aHWQ2Zw7AITwSEo2.jpg","original_language":"en","original_title":"Star Wars: The Rise of Skywalker","genre_ids":[28,12,878],"title":"Star Wars: The Rise of Skywalker","vote_average":6.6,"overview":"The surviving Resistance faces the First Order once again as the journey of Rey, Finn and Poe Dameron continues. With the power and knowledge of generations behind them, the final battle begins.","release_date":"2019-12-18"},{"popularity":65.077,"vote_count":9647,"video":false,"poster_path":"/lvWL5ZRlYFh7M7fOvYswcRqyprI.jpg","id":194662,"adult":false,"backdrop_path":"/pDqwUJJSaHIv2sxyRYfmYBFeU9C.jpg","original_language":"en","original_title":"Birdman or (The Unexpected Virtue of Ignorance)","genre_ids":[35,18],"title":"Birdman or (The Unexpected Virtue of Ignorance)","vote_average":7.5,"overview":"A fading actor best known for his portrayal of a popular superhero attempts to mount a comeback by appearing in a Broadway play. As opening night approaches, his attempts to become more altruistic, rebuild his career, and reconnect with friends and family prove more difficult than expected.","release_date":"2014-08-27"},{"popularity":73.985,"vote_count":5390,"video":false,"poster_path":"/h4VB6m0RwcicVEZvzftYZyKXs6K.jpg","id":495764,"adult":false,"backdrop_path":"/9xNOiv6DZZjH7ABoUUDP0ZynouU.jpg","original_language":"en","original_title":"Birds of Prey (and the Fantabulous Emancipation of One Harley Quinn)","genre_ids":[28,35,80],"title":"Birds of Prey (and the Fantabulous Emancipation of One Harley Quinn)","vote_average":7.2,"overview":"Harley Quinn joins forces with a singer, an assassin and a police detective to help a young girl who had a hit placed on her after she stole a rare diamond from a crime lord.","release_date":"2020-02-05"},{"popularity":53.681,"vote_count":19,"video":false,"poster_path":"/k50gYFDfpAyxcIGjWjnXAaOM81e.jpg","id":505707,"adult":false,"backdrop_path":"/l0vUzd701TzvN3jywXex9G01zpd.jpg","original_language":"en","original_title":"Waiting for the Barbarians","genre_ids":[18],"title":"Waiting for the Barbarians","vote_average":5.4,"overview":"At an isolated frontier outpost, a colonial magistrate suffers a crisis of conscience when an army colonel arrives looking to interrogate the locals about an impending uprising, using cruel tactics that horrify the magistrate.","release_date":"2020-07-30"}]
     */

    private int page;
    private int total_results;
    private int total_pages;
    private List<ResultsBean> results;

    @Getter
    @Setter
    @NoArgsConstructor
    public static class ResultsBean implements Serializable {

        private Double popularity;
        private Integer vote_count;
        private String original_language;
        private String original_title;
        private String title;
        private Double vote_average;
        private String overview;
        private String release_date;


    }
}
