package com.dragovorn.dotaapi.match.hero;

/**
 * Auto generated hero enum
 */
public enum Hero {

    ANTIMAGE(1),
    AXE(2),
    BANE(3),
    BLOODSEEKER(4),
    CRYSTAL_MAIDEN(5),
    DROW_RANGER(6),
    EARTHSHAKER(7),
    JUGGERNAUT(8),
    MIRANA(9),
    NEVERMORE(11),
    MORPHLING(10),
    PHANTOM_LANCER(12),
    PUCK(13),
    PUDGE(14),
    RAZOR(15),
    SAND_KING(16),
    STORM_SPIRIT(17),
    SVEN(18),
    TINY(19),
    VENGEFULSPIRIT(20),
    WINDRUNNER(21),
    ZUUS(22),
    KUNKKA(23),
    LINA(25),
    LICH(31),
    LION(26),
    SHADOW_SHAMAN(27),
    SLARDAR(28),
    TIDEHUNTER(29),
    WITCH_DOCTOR(30),
    RIKI(32),
    ENIGMA(33),
    TINKER(34),
    SNIPER(35),
    NECROLYTE(36),
    WARLOCK(37),
    BEASTMASTER(38),
    QUEENOFPAIN(39),
    VENOMANCER(40),
    FACELESS_VOID(41),
    SKELETON_KING(42),
    DEATH_PROPHET(43),
    PHANTOM_ASSASSIN(44),
    PUGNA(45),
    TEMPLAR_ASSASSIN(46),
    VIPER(47),
    LUNA(48),
    DRAGON_KNIGHT(49),
    DAZZLE(50),
    RATTLETRAP(51),
    LESHRAC(52),
    FURION(53),
    LIFE_STEALER(54),
    DARK_SEER(55),
    CLINKZ(56),
    OMNIKNIGHT(57),
    ENCHANTRESS(58),
    HUSKAR(59),
    NIGHT_STALKER(60),
    BROODMOTHER(61),
    BOUNTY_HUNTER(62),
    WEAVER(63),
    JAKIRO(64),
    BATRIDER(65),
    CHEN(66),
    SPECTRE(67),
    DOOM_BRINGER(69),
    ANCIENT_APPARITION(68),
    URSA(70),
    SPIRIT_BREAKER(71),
    GYROCOPTER(72),
    ALCHEMIST(73),
    INVOKER(74),
    SILENCER(75),
    OBSIDIAN_DESTROYER(76),
    LYCAN(77),
    BREWMASTER(78),
    SHADOW_DEMON(79),
    LONE_DRUID(80),
    CHAOS_KNIGHT(81),
    MEEPO(82),
    TREANT(83),
    OGRE_MAGI(84),
    UNDYING(85),
    RUBICK(86),
    DISRUPTOR(87),
    NYX_ASSASSIN(88),
    NAGA_SIREN(89),
    KEEPER_OF_THE_LIGHT(90),
    WISP(91),
    VISAGE(92),
    SLARK(93),
    MEDUSA(94),
    TROLL_WARLORD(95),
    CENTAUR(96),
    MAGNATAUR(97),
    SHREDDER(98),
    BRISTLEBACK(99),
    TUSK(100),
    SKYWRATH_MAGE(101),
    ABADDON(102),
    ELDER_TITAN(103),
    LEGION_COMMANDER(104),
    EMBER_SPIRIT(106),
    EARTH_SPIRIT(107),
    TERRORBLADE(109),
    PHOENIX(110),
    ORACLE(111),
    TECHIES(105),
    WINTER_WYVERN(112),
    ARC_WARDEN(113),
    ABYSSAL_UNDERLORD(108),
    MONKEY_KING(114);

    private final int id;

    Hero(int id) {
        this.id = id;
    }

    public int id() {
        return this.id;
    }

    public static Hero getFromId(int id) {
        for (Hero hero : values()) {
            if (hero.id() == id) {
                return hero;
            }
        }

        throw new IllegalArgumentException("There is no hero " + id);
    }
}