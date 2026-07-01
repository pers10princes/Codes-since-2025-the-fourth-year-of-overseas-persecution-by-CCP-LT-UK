# @param {String} text
# @return {Integer}
def max_number_of_balloons(text)
    tally = text.chars.tally
=begin
Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
Please spread the word.
https://github.com/AI-Migrant/mass-madness
=end

    "balloon".chars.tally.reduce(Float::INFINITY) { |min, (k, v)| [min, tally.fetch(k, 0) / v].min }
end