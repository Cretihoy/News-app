package com.cretihoy.newsapp.data.newmodel


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ArticleDto(
    @SerializedName("source")
    @Expose
    val source: Source,
    @SerializedName("author")
    @Expose
    val author: String?, // Kelly Phillips Erb
    @SerializedName("title")
    @Expose
    val title: String, // Former IRS Contractor Will Go To Jail For Disclosing Trump's Tax Returns - Forbes
    @SerializedName("description")
    @Expose
    val description: String?, // Charles Littlejohn has been sentenced to five years in prison for disclosing thousands of tax returns—including President Trump’s tax returns—without authorization.
    @SerializedName("url")
    @Expose
    val url: String, // https://www.forbes.com/sites/kellyphillipserb/2024/01/30/former-irs-contractor-will-go-to-jail-for-disclosing-trumps-tax-returns/
    @SerializedName("urlToImage")
    @Expose
    val urlToImage: String?, // https://imageio.forbes.com/specials-images/imageserve/63f18c6a80e39eabc256b89e/0x0.jpg?format=jpg&height=900&width=1600&fit=bounds
    @SerializedName("publishedAt")
    @Expose
    val publishedAt: String, // 2024-01-30T12:00:00Z
    @SerializedName("content")
    @Expose
    val content: String? // A former IRS contractor has been sentenced to five years in prison for disclosing thousands of tax returnsincluding Donald Trumps tax returnswithout authorization.Charles Littlejohn abused his posi… [+5986 chars]
)