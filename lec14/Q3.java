public int castSpell(Spell s1, Spell s2) {
    if (s1 instanceof Water && s2 instanceof Fire) {
        return 0;
    } else if (s1 instanceof Fire && s2 instanceof Water) {
        return 1;
    }

    return s1.intensity < s2.intensity;
}
