package zzz1999.InfluenceTest;

import java.util.ArrayList;
import java.util.Scanner;

public class InfluenceTest {
    private int status = 0;
    private int current = 0;

    public InfluenceTest() {
    }

    public static void main(String[] args) {
        (new InfluenceTest()).start();
    }

    private void start() {
        System.out.println("影响力水平测试");
        System.out.println("测试总共10道题,请将你认为正确的答案输入");
        System.out.println("按任意键继续......");
        Scanner s = new Scanner(System.in);

        while (true) {
            String line = s.nextLine().toLowerCase();
            String title;
            String A;
            String B;
            String C;
            String D;
            switch (this.status) {
                case 0:
                    title = "1.在哪种情况下，人们更有可能被缺乏说服力而不是更具有说服力的证据所说服：";
                    A = "a.赶时间";
                    B = "b.对该话题根本不感兴趣";
                    C = "c.对该话题的兴趣一般";
                    D = "d.a和b";
                    this.printQuestion(title, A, B, C, D);
                    this.status = 1;
                    break;
                case 1:
                    if (this.isTrue(1, line)) {
                        ++this.current;
                    }
                    if (this.isCorrectInput(line)) {

                        title = "2.假设你正试着将拥有三种不同价位的同一种商品（经济型、普通型、豪华型）推销给顾客。研究表明在哪种情况下，你的销售额会更高：";
                        A = "a.从价格最便宜的商品开始，然后向上销售";
                        B = "b.从价格最贵的商品开始，然后向下销售";
                        C = "c.从价格适中的商品开始，然后让顾客自己决定需要买哪一种";
                        D = "";
                        this.printQuestion(title, A, B, C, D);
                        this.status = 2;
                    }

                    break;
                case 2:
                    if (this.isTrue(2, line)) {
                        ++this.current;
                    }
                    if (this.isCorrectInput(line)) {

                        title = "3.人们对政治竞选进行了多年的跟踪调查，结果表明，最有可能赢得胜利的候选人是：";
                        A = "a.外表最有吸引力的候选人";
                        B = "b.制造大量负面的或带有攻击性的新闻来防御竞争对手的候选人";
                        C = "c.拥有最有活力、最卖力的志愿者的候选人";
                        D = "";
                        this.printQuestion(title, A, B, C, D);
                        this.status = 3;
                    }
                    break;
                case 3:
                    if (this.isTrue(3, line)) {
                        ++this.current;
                    }

                    if (this.isCorrectInput(line)) {
                        title = "4.研究表明，通常情况下，自尊与被劝服之间的关系是：";
                        A = "a.自尊心不强的人，最容易被说服";
                        B = "b.自尊心一般的人，最容易被说服";
                        C = "c.自尊心强的人，最容易被说服";
                        D = "";
                        this.printQuestion(title, A, B, C, D);
                        this.status = 4;
                    }
                    break;
                case 4:
                    if (this.isTrue(4, line)) {
                        ++this.current;
                    }
                    if (this.isCorrectInput(line)) {
                        title = "5.假设有一位政治候选人最近刚刚失去民众的信任。不幸的是，你是这位候选人的竞选班子的负责人。如果这位候选人欲借严厉打击犯罪重树他的声望，你认为在他开始下一站宣传时，哪一个选项是最好的方式：";
                        A = "a.我的对手在打击犯罪方面做得很不够……";
                        B = "b.很多民众支持我打击犯罪的意愿，而且他们相信我有这个能力……";
                        C = "c.虽然我的对手在打击犯罪方面有着不俗的表现……";
                        D = "";
                        this.printQuestion(title, A, B, C, D);
                        this.status = 5;
                    }
                    break;
                case 5:
                    if (this.isTrue(5, line)) {
                        ++this.current;
                    }
                    if (this.isCorrectInput(line)) {
                        title = "6.假设你是一位理财顾问，你认为你的一位顾客在投资方面太过保守。为了说服他投资风险较高、回报也较高的项目，你应该注重讲述：";
                        A = "a.与他相似的人是如何犯同样的错误的。";
                        B = "b.如果他在那些风险更大的项目上投资，他会得到什么。";
                        C = "c.如果他没有在那些风险较大的项目上投资，他会失去什么。";
                        D = "";
                        this.printQuestion(title, A, B, C, D);
                        this.status = 6;
                    }
                    break;
                case 6:
                    if (this.isTrue(6, line)) {
                        ++this.current;
                    }
                    if (this.isCorrectInput(line)) {
                        title = "7.研究表明，陪审员最有可能被以下哪种人说服：";
                        A = "a.讲话简明易懂的证人";
                        B = "b.讲述时使用令人难以理解的术语的证人";
                        C = "c.讲述的内容有说服力的证人";
                        D = "";
                        this.printQuestion(title, A, B, C, D);
                        this.status = 7;
                    }
                    break;
                case 7:
                    if (this.isTrue(7, line)) {
                        ++this.current;
                    }
                    if (this.isCorrectInput(line)) {
                        title = "8.如果你有一则新消息，你会在什么时候说出它是新消息？";
                        A = "a.在讲述这则消息之前";
                        B = "b.在讲述这则消息当中";
                        C = "c.在讲完这则消息之后";
                        D = "d.你不会提到这是一则新消息的";
                        this.printQuestion(title, A, B, C, D);
                        this.status = 8;
                    }
                    break;
                case 8:
                    if (this.isTrue(8, line)) {
                        ++this.current;
                    }
                    if (this.isCorrectInput(line)) {
                        title = "9.假设你正在介绍你的方案，而且你马上就讲到关键内容了，这一部分包括那些极具说服力的用以支持你的观点的论据。请问，讲到这一部分时，你的语速会有多快？";
                        A = "a.你的语速特别快";
                        B = "b.你的语速稍微快一点";
                        C = "c.你的语速适中";
                        D = "d.你的语速很慢";
                        this.printQuestion(title, A, B, C, D);
                        this.status = 9;
                    }
                    break;
                case 9:
                    if (this.isTrue(9, line)) {
                        ++this.current;
                    }
                    if (this.isCorrectInput(line)) {
                        title = "10.社会心理学的研究表明，6个最基本的影响他人的原理是：";
                        A = "a.热情、愉悦、不和谐、回忆、关注、正面联想";
                        B = "b.参与、调整、催眠、反射、原型、潜意识的说服";
                        C = "c.一致、权威、互惠、喜好、社会认同、短缺";
                        D = "";
                        this.printQuestion(title, A, B, C, D);
                        this.status = 10;
                    }
                    break;
                case 10:
                    if (this.isTrue(10, line)) {
                        ++this.current;
                    }
                    if (this.isCorrectInput(line)) {
                        System.out.println("恭喜你完成了测试,你总共答对了" + this.current + "道题");
                        switch (this.current) {
                            case 0:
                            case 1:
                            case 2:
                                System.out.println("我想说的是，如果我有一些房产，我很愿意向你推销……");
                                break;
                            case 3:
                            case 4:
                                System.out.println("这说明你需要采取一些改进措施");
                                break;
                            case 5:
                            case 6:
                                System.out.println("说明你很擅长说服他人。但你需要浏览本网页上的文章以提高你的技巧。");
                                break;
                            case 7:
                            case 8:
                                System.out.println("说明你的说服力令人印象深刻。你会很愿意阅读我们在网页上的文章，以补充你现有的知识库。");
                                break;
                            case 9:
                            case 10:
                                System.out.println("你绝对是一个说服他人的天才。我没有什么可以教给你的了。所以你不要再在这里浪费时间了，赶快去写一本说服力方面的书吧！别忘了写好以后送我一本。");
                                break;
                        }
                        this.status = 11;
                    }
                    break;
                case 11:
                    break;
            }
            if (this.status == 11) {
                break;
            }

        }
    }

    /**
     * 打印问题以及选项
     */
    private void printQuestion(String question, String A, String B, String C, String D) {
        if (!question.isEmpty()) {
            System.out.println(question);
        }

        if (!A.isEmpty()) {
            System.out.println(A);
        }

        if (!B.isEmpty()) {
            System.out.println(B);
        }

        if (!C.isEmpty()) {
            System.out.println(C);
        }

        if (!D.isEmpty()) {
            System.out.println(D);
        }

    }

    /**
     * 返回是否答对
     */
    private Boolean isTrue(int num, String choose) {
        String[] arr = new String[]{"d", "b", "a", "b", "c", "c", "b", "a", "d", "c"};
        return (arr[num - 1].equals(choose));
    }

    private Boolean isCorrectInput(String s) {
        ArrayList<String> list = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
            add("d");
        }};
        if (list.contains(s)) {
            return true;
        } else {
            System.out.println("输入有误,请重新输入");
            return false;
        }
    }
}
