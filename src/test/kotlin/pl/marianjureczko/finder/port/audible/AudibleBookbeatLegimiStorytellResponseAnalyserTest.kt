package pl.marianjureczko.finder.port.audible

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AudibleBookbeatLegimiStorytellResponseAnalyserTest {
    @Test
    fun shouldAnalyseHtmlFromAudible() {
        //given
        val analyser = AudibleResponseAnalyser()

        //when
        val actual = analyser.execute(html, "red dragon")

        //then
        assertEquals(actual, AudibleApi.BASE_URL + "/pd/Red-Dragon-Audiobook/B007IKTSTY?qid=1729753976&sr=1-1&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_1")
    }

    val html = """
<!DOCTYPE html>
<html lang="en-US">
<head> </head>
<body>
 	<ul  class="bc-list    bc-list-nostyle">
<li class="bc-list-item	productListItem" aria-label='Red Dragon'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B007IKTSTY" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B007IKTSTY' href="/pd/Red-Dragon-Audiobook/B007IKTSTY?qid=1729753976&amp;sr=1-1&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_1">
<div class="adbl-asin-impression "
     data-asin="B007IKTSTY" data-widget="" data-position="1" data-face-out=""
     data-source="" data-url="/pd/Red-Dragon-Audiobook/B007IKTSTY?qid=1729753976&amp;sr=1-1&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_1" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51TICokhCDL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51TICokhCDL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51TICokhCDL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51TICokhCDL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51TICokhCDL._SL500_.jpg"  loading="lazy"
                 alt="Red Dragon Audiobook By Thomas Harris cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51TICokhCDL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51TICokhCDL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div><div id="product-list-flyout-B007IKTSTY" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Red Dragon" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Red Dragon</h2>
</li>
<li class="bc-list-item" >
                        By:
                        Thomas Harris
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Alan Sklar
</li>
<li class="bc-list-item" >
                        Length: 12 hrs and 6 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            5,306
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            4,759
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            4,749
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        An innocent family are the latest victims of a grisly series of hideous sacrificial killings that no one understands, and no one can stop. Nobody lives to tell of the unimaginable carnage. Only the blood-stained walls bear witness. All hope rests on Special Agent Will Graham, who must peer inside the killer's tortured soul to understand his rage, to anticipate and prevent his next vicious crime. Desperate for help, Graham finds himself locked in a deadly alliance with the brilliant Dr. Hannibal Lecter, the infamous mass murderer.
</p>
<div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            The Best Police Procedural of Our Time
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Chip Atkinson</span>
                          on
                        06-21-15
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B007IKTSTY" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B007IKTSTY"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/sans/005874/bk_sans_005874_sample.mp3"
              sample-asin="B007IKTSTY"
              sample-ajax-token="gh7gt8JX1g3DsHGYnaSU2Y05fE0YAhQqeZsZ3l0AAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Red Dragon"
              data-play-label="Play Sample for Red Dragon"
              data-pause-label="Pause Sample for Red Dragon"
              data-load-label="Loading Sample for Red Dragon"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Red-Dragon-Audiobook/B007IKTSTY?qid=1729753976&amp;sr=1-1&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_1">Red Dragon</a>
                            </h3>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Thomas-Harris/B000AQ28TK?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_1_1">Thomas Harris</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Alan+Sklar&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_1_1">Alan Sklar</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Hannibal-Lecter-Series-Audiobooks/B0083VFX9G?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_1_1">Hannibal Lecter Series</a>, Book 1
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 12 hrs and 6 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    03-09-12
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >5,306 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-0" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-0" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-0" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-0" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-0" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-0" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-0" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-0" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-0" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-0" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-0" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-0" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}20.24
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-0" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}20.24</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Red-Dragon-Audiobook/B007IKTSTY?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Red Dragon'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B00HUVO7C4" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B00HUVO7C4' href="/pd/Red-Dragon-Audiobook/B00HUVO7C4?qid=1729753976&amp;sr=1-2&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_2">
<div class="adbl-asin-impression "
     data-asin="B00HUVO7C4" data-widget="" data-position="2" data-face-out=""
     data-source="" data-url="/pd/Red-Dragon-Audiobook/B00HUVO7C4?qid=1729753976&amp;sr=1-2&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_2" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/61BklVa4DpL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61BklVa4DpL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/61BklVa4DpL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61BklVa4DpL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/61BklVa4DpL._SL500_.jpg"  loading="lazy"
                 alt="Red Dragon Audiobook By Thomas Harris cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/61BklVa4DpL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61BklVa4DpL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B00HUVO7C4" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Red Dragon" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Red Dragon</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        Hannibal Lecter, Book 1
</li>
<li class="bc-list-item" >
                        By:
                        Thomas Harris
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Alan Sklar
</li>
<li class="bc-list-item" >
                        Length: 12 hrs and 6 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            44
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            42
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            42
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        A quiet summer night...a neat suburban house...and another innocent, happy family is shattered - the latest victims of a grisly series of hideous sacrificial killings that no one understands, and no one can stop. Nobody lives to tell of the unimaginable carnage. Only the blood-stained walls bear witness. All hope rests on Special Agent Will Graham, who must peer inside the killer's tortured soul to understand his rage, to anticipate and prevent his next vicious crime. Desperate for help, Graham finds himself locked in a deadly alliance with the brilliant Dr. Hannibal Lecter, the infamous mass murderer who Graham put in prison years ago.
</p>
<div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            9ice
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Anonymous User</span>
                          on
                        09-14-20
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B00HUVO7C4" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B00HUVO7C4"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/adbl/014672/bk_adbl_014672_sample.mp3"
              sample-asin="B00HUVO7C4"
              sample-ajax-token="gi+4KNQRoO1sjCPmNLh6AjeggwNtFaDfrHdipLEAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Red Dragon"
              data-play-label="Play Sample for Red Dragon"
              data-pause-label="Pause Sample for Red Dragon"
              data-load-label="Loading Sample for Red Dragon"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Red-Dragon-Audiobook/B00HUVO7C4?qid=1729753976&amp;sr=1-2&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_2">Red Dragon</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >Hannibal Lecter, Book 1</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Thomas-Harris/B000AQ28TK?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_2_1">Thomas Harris</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Alan+Sklar&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_2_1">Alan Sklar</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Hannibal-Lecter-Series-Audiobooks/B0083VFX9G?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_2_1">Hannibal Lecter Series</a>, Book 1
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 12 hrs and 6 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    02-04-14
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >44 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-1" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-1" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-1" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-1" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-1" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-1" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-1" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-1" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-1" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-1" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-1" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-1" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}24.30
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-1" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}24.30</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Red-Dragon-Audiobook/B00HUVO7C4?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Red Dragon'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B002V57N84" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B002V57N84' href="/pd/Red-Dragon-Audiobook/B002V57N84?qid=1729753976&amp;sr=1-3&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_3">
<div class="adbl-asin-impression "
     data-asin="B002V57N84" data-widget="" data-position="3" data-face-out=""
     data-source="" data-url="/pd/Red-Dragon-Audiobook/B002V57N84?qid=1729753976&amp;sr=1-3&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_3" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51JrfKEXDkL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51JrfKEXDkL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51JrfKEXDkL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51JrfKEXDkL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51JrfKEXDkL._SL500_.jpg"  loading="lazy"
                 alt="Red Dragon Audiobook By Thomas Harris cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51JrfKEXDkL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51JrfKEXDkL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B002V57N84" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Red Dragon" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Red Dragon</h2>
</li>
<li class="bc-list-item" >
                        By:
                        Thomas Harris
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Chris Sarandon
</li>
<li class="bc-list-item" >
                        Length: 3 hrs and 5 mins
</li>
<li class="bc-list-item" >
                    Abridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            232
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            141
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            141
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        From the author of <i>Silence of the Lambs</i>, it's the terrifying tale that introduced the world to Hannibal "the Cannibal" Lecter. There's a serial killer on the loose who specializes in murdering innocent, happy families, and now it's up to FBI Special Agent Will Graham to understand the brutal killer's motivation and anticipate his next move. Graham needs to get inside the killer's mind; to do that, he needs the help of the brilliant, psychopathic Hannibal Lecter. <p></p>
        </p>
        <div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >2 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            Very choppy abridgement
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >css</span>
                          on
                        03-29-03
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B002V57N84" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B002V57N84"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/sans/000063/bk_sans_000063_sample.mp3"
              sample-asin="B002V57N84"
              sample-ajax-token="gu2wBVA5mxwc1uhI7nMKSd2YhrS7ZmvKfOwBGJwAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Red Dragon"
              data-play-label="Play Sample for Red Dragon"
              data-pause-label="Pause Sample for Red Dragon"
              data-load-label="Loading Sample for Red Dragon"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Red-Dragon-Audiobook/B002V57N84?qid=1729753976&amp;sr=1-3&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_3">Red Dragon</a>
                            </h3>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Thomas-Harris/B000AQ28TK?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_3_1">Thomas Harris</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Chris+Sarandon&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_3_1">Chris Sarandon</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Hannibal-Lecter-abridged-Audiobooks/B07FKVZ12H?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_3_1">Hannibal Lecter (abridged)</a>, Book 1
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 3 hrs and 5 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    03-09-00
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >232 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-2" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-2" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-2" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-2" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-2" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-2" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-2" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-2" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-2" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-2" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-2" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-2" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}10.35
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-2" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}10.35</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Red-Dragon-Audiobook/B002V57N84?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Dragon&apos;s Baby'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B077PMNGKX" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B077PMNGKX' href="/pd/Dragons-Baby-Audiobook/B077PMNGKX?qid=1729753976&amp;sr=1-4&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_4">
<div class="adbl-asin-impression "
     data-asin="B077PMNGKX" data-widget="" data-position="4" data-face-out=""
     data-source="" data-url="/pd/Dragons-Baby-Audiobook/B077PMNGKX?qid=1729753976&amp;sr=1-4&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_4" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/61U0UvHBJbL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61U0UvHBJbL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/61U0UvHBJbL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61U0UvHBJbL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/61U0UvHBJbL._SL500_.jpg"  loading="lazy"
                 alt="Dragon's Baby Audiobook By Miranda Martin, Juno Wells cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/61U0UvHBJbL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61U0UvHBJbL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B077PMNGKX" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Dragon's Baby" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Dragon's Baby</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        Red Planet Dragons of Tajss, Book 1
</li>
<li class="bc-list-item" >
                        By:
                        Miranda Martin, Juno Wells
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Tristan James, Jillian Macie
</li>
<li class="bc-list-item" >
                        Length: 5 hrs and 59 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            479
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            436
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            437
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        Calista is happy with her life of scientific research. She doesn't need love, she has her books, her friends, and her work. Things are fine until her ship is attacked by space pirates and crash lands on a desert planet with heat so intense she and her friends can't survive without help. Ladon is a Zmaj warrior resigned to a life alone, who only desires to protect his treasures. His hopes for a mate faded long ago, yet when he meets Calista something stirs. It takes only one look to know that she belongs to him.
</p>
<div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            Dragon instalove!
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Jonella A. Moore</span>
                          on
                        12-07-17
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B077PMNGKX" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B077PMNGKX"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/tant/008943/bk_tant_008943_sample.mp3"
              sample-asin="B077PMNGKX"
              sample-ajax-token="gitgmZfmHUd5Vb0pbJqk6K6XX6rIwhKUKMF1S4wAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Dragon&amp;apos;s Baby"
              data-play-label="Play Sample for Dragon&amp;apos;s Baby"
              data-pause-label="Pause Sample for Dragon&amp;apos;s Baby"
              data-load-label="Loading Sample for Dragon&amp;apos;s Baby"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Dragons-Baby-Audiobook/B077PMNGKX?qid=1729753976&amp;sr=1-4&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_4">Dragon's Baby</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >Red Planet Dragons of Tajss, Book 1</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Miranda-Martin/B01J7AUOS6?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_4_1">Miranda Martin</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchAuthor=Juno+Wells&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_4_2">Juno Wells</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Tristan+James&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_4_1">Tristan James</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Jillian+Macie&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_4_2">Jillian Macie</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Red-Planet-Dragons-of-Tajss-Audiobooks/B0797MKS92?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_4_1">Red Planet Dragons of Tajss</a>, Book 1
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 5 hrs and 59 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    12-05-17
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >479 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-3" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-3" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-3" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-3" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-3" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-3" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-3" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-3" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-3" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-3" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-3" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-3" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}20.00
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-3" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}20.00</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
<div id="adbl-included-in-membership-container-3" class="bc-row
    bc-spacing-top-none
    bc-spacing-none
    bc-text-left"  style="">
  Included in Plus membership
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Dragons-Baby-Audiobook/B077PMNGKX?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Onyx Storm'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B0CZFKLZ9M" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B0CZFKLZ9M' href="/pd/Onyx-Storm-Audiobook/B0CZFKLZ9M?qid=1729753976&amp;sr=1-5&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_5">
<div class="adbl-asin-impression "
     data-asin="B0CZFKLZ9M" data-widget="" data-position="5" data-face-out=""
     data-source="" data-url="/pd/Onyx-Storm-Audiobook/B0CZFKLZ9M?qid=1729753976&amp;sr=1-5&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_5" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51Kw5cyyk5L._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51Kw5cyyk5L._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51Kw5cyyk5L._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51Kw5cyyk5L._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51Kw5cyyk5L._SL500_.jpg"  loading="lazy"
                 alt="Onyx Storm Audiobook By Rebecca Yarros cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51Kw5cyyk5L._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51Kw5cyyk5L._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B0CZFKLZ9M" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Onyx Storm" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Onyx Storm</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        The Empyrean, Book 3
</li>
<li class="bc-list-item" >
                        By:
                        Rebecca Yarros
</li>
<li class="bc-list-item" >
                        Length: 14 hrs and 15 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >0 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            0
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >0 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            0
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >0 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            0
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        <p>Get ready to fly or die in the breathtaking follow-up to Fourth Wing and Iron Flame from #1 New York Times bestselling author Rebecca Yarros.</p>
        </p>
    </div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Onyx-Storm-Audiobook/B0CZFKLZ9M?qid=1729753976&amp;sr=1-5&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_5">Onyx Storm</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >The Empyrean, Book 3</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Rebecca-Yarros/B00HYKBU1W?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_5_1">Rebecca Yarros</a>
                                  </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Empyrean-Audiobooks/B0CB11LYGJ?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_5_1">The Empyrean</a>, Book 3
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 14 hrs and 15 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    01-21-25
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Not rated yet</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-4" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-4" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-4" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-4" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-4" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-4" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-4" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-4" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-4" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-4" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-4" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-4" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}31.49
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-4" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}31.49</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-preorder
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Onyx-Storm-Audiobook/B0CZFKLZ9M?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Pre-order: Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='The Red Wyvern'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B0BRLC2Z8R" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B0BRLC2Z8R' href="/pd/The-Red-Wyvern-Audiobook/B0BRLC2Z8R?qid=1729753976&amp;sr=1-6&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_6">
<div class="adbl-asin-impression "
     data-asin="B0BRLC2Z8R" data-widget="" data-position="6" data-face-out=""
     data-source="" data-url="/pd/The-Red-Wyvern-Audiobook/B0BRLC2Z8R?qid=1729753976&amp;sr=1-6&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_6" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51FIgmtvjZL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51FIgmtvjZL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51FIgmtvjZL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51FIgmtvjZL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51FIgmtvjZL._SL500_.jpg"  loading="lazy"
                 alt="The Red Wyvern Audiobook By Katharine Kerr cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51FIgmtvjZL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51FIgmtvjZL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B0BRLC2Z8R" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-The Red Wyvern" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >The Red Wyvern</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        The Dragon Mage, Book 1
</li>
<li class="bc-list-item" >
                        By:
                        Katharine Kerr
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Ruth Urquhart
</li>
<li class="bc-list-item" >
                        Length: 14 hrs and 3 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            46
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            36
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            36
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        <p>In a kingdom torn by civil war, young Lillorigga seeks to shield her dawning powers from her cruel mother Merodda's manipulation. Mistress of a magic that, untamed, could kill her, Lilli brings her terrifying visions under the kindlier tutelage of the mysterious dweomermaster, Nevyn. But soon she must choose between her own clan and the true king who fights to claim his rightful throne, between sanctuary and blood feud, loyalty and love. </p>
        </p>
        <div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            Great series
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Tammie Hanebuth</span>
                          on
                        01-24-23
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B0BRLC2Z8R" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B0BRLC2Z8R"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/tant/035819/bk_tant_035819_sample.mp3"
              sample-asin="B0BRLC2Z8R"
              sample-ajax-token="glg9t4qDubwZwStO4HvBb1C7sDlgPDOOAyT89JUAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for The Red Wyvern"
              data-play-label="Play Sample for The Red Wyvern"
              data-pause-label="Pause Sample for The Red Wyvern"
              data-load-label="Loading Sample for The Red Wyvern"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/The-Red-Wyvern-Audiobook/B0BRLC2Z8R?qid=1729753976&amp;sr=1-6&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_6">The Red Wyvern</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >The Dragon Mage, Book 1</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Katharine-Kerr/B000AQ3VTQ?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_6_1">Katharine Kerr</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Ruth+Urquhart&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_6_1">Ruth Urquhart</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/The-Dragon-Mage-Audiobooks/B0BRMT2M24?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_6_1">The Dragon Mage</a>, Book 1
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 14 hrs and 3 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    01-17-23
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >46 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-5" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-5" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-5" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-5" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-5" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-5" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-5" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-5" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-5" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-5" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-5" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-5" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}21.49
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-5" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}21.49</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
<div id="adbl-included-in-membership-container-5" class="bc-row
    bc-spacing-top-none
    bc-spacing-none
    bc-text-left"  style="">
  Included in Plus membership
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/The-Red-Wyvern-Audiobook/B0BRLC2Z8R?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Red Dragon'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B09HY2RXMX" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B09HY2RXMX' href="/pd/Red-Dragon-Audiobook/B09HY2RXMX?qid=1729753976&amp;sr=1-7&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_7">
<div class="adbl-asin-impression "
     data-asin="B09HY2RXMX" data-widget="" data-position="7" data-face-out=""
     data-source="" data-url="/pd/Red-Dragon-Audiobook/B09HY2RXMX?qid=1729753976&amp;sr=1-7&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_7" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51rTbPXlyAL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51rTbPXlyAL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51rTbPXlyAL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51rTbPXlyAL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51rTbPXlyAL._SL500_.jpg"  loading="lazy"
                 alt="Red Dragon Audiobook By William C. Dietz cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51rTbPXlyAL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51rTbPXlyAL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B09HY2RXMX" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Red Dragon" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Red Dragon</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        Winds of War, Book 3
</li>
<li class="bc-list-item" >
                        By:
                        William C. Dietz
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Ryan Burke
</li>
<li class="bc-list-item" >
                        Length: 8 hrs and 51 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            26
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            22
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            22
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        <p> </p> <p>World War III is a few months month old. After attacking and sinking the Destroyer USS <i>Stacy Heath</i>, the Chinese seize control of Nepal and Bhutan and push into India where the Allies manage to stop them. But for how long? Pakistan is attacking from the north - and China is preparing for the "big push" from the east. Worse yet, China's Ministry of State Security has orders to assassinate the Dalai Lama, rather than run the risk that he will inspire a Buddhist rebellion in Tibet.</p>
        </p>
        <div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >2 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            perfectly horrible
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Taylor douglas gunter</span>
                          on
                        06-13-22
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B09HY2RXMX" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B09HY2RXMX"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/tant/029397/bk_tant_029397_sample.mp3"
              sample-asin="B09HY2RXMX"
              sample-ajax-token="ggFr6ZdF+3M/vPcMlVK0xCyaJkYqSKCspKfNjVwAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Red Dragon"
              data-play-label="Play Sample for Red Dragon"
              data-pause-label="Pause Sample for Red Dragon"
              data-load-label="Loading Sample for Red Dragon"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Red-Dragon-Audiobook/B09HY2RXMX?qid=1729753976&amp;sr=1-7&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_7">Red Dragon</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >Winds of War, Book 3</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/William-C-Dietz/B000APAA1O?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_7_1">William C. Dietz</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Ryan+Burke&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_7_1">Ryan Burke</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Winds-of-War-Audiobooks/B09CKTZSDT?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_7_1">Winds of War</a>, Book 3
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 8 hrs and 51 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    10-26-21
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >26 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-6" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-6" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-6" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-6" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-6" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-6" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-6" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-6" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-6" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-6" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-6" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-6" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}17.19
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-6" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}17.19</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
<div id="adbl-included-in-membership-container-6" class="bc-row
    bc-spacing-top-none
    bc-spacing-none
    bc-text-left"  style="">
  Included in Plus membership
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Red-Dragon-Audiobook/B09HY2RXMX?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Dragon&apos;s Mate'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B079585XKM" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B079585XKM' href="/pd/Dragons-Mate-Audiobook/B079585XKM?qid=1729753976&amp;sr=1-8&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_8">
<div class="adbl-asin-impression "
     data-asin="B079585XKM" data-widget="" data-position="8" data-face-out=""
     data-source="" data-url="/pd/Dragons-Mate-Audiobook/B079585XKM?qid=1729753976&amp;sr=1-8&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_8" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/61vRyg7Bt0L._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61vRyg7Bt0L._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/61vRyg7Bt0L._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61vRyg7Bt0L._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/61vRyg7Bt0L._SL500_.jpg"  loading="lazy"
                 alt="Dragon's Mate Audiobook By Miranda Martin, Juno Wells cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/61vRyg7Bt0L._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61vRyg7Bt0L._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B079585XKM" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Dragon's Mate" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Dragon's Mate</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        Red Planet Dragons of Tajss Series, Book 2
</li>
<li class="bc-list-item" >
                        By:
                        Miranda Martin, Juno Wells
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Tristan James, Jillian Macie
</li>
<li class="bc-list-item" >
                        Length: 6 hrs and 11 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            307
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            279
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            277
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        <p>Like being stranded on a desert alien planet wasn't enough.... All I ever wanted was someone to love. Now my best friend is knocked up by the only hunky alien-dragon available and I can't tell anyone how totally jealous I am. The handful of humans who survived our ship's crash are locked in a struggle to live in sweltering heat with dwindling supplies. The others are taking the life giving, addictive epis but if I take it that means I'm stuck here. Forever. Which also means the chance of being rescued by a knight in shining armor would be zero.</p>
        </p>
        <div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            Ok
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >michele</span>
                          on
                        04-08-18
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B079585XKM" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B079585XKM"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/tant/009761/bk_tant_009761_sample.mp3"
              sample-asin="B079585XKM"
              sample-ajax-token="gkVNuU8nbUmpbrZ5WnuhcmjCf9kDnYwaEdpz95sAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Dragon&amp;apos;s Mate"
              data-play-label="Play Sample for Dragon&amp;apos;s Mate"
              data-pause-label="Pause Sample for Dragon&amp;apos;s Mate"
              data-load-label="Loading Sample for Dragon&amp;apos;s Mate"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Dragons-Mate-Audiobook/B079585XKM?qid=1729753976&amp;sr=1-8&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_8">Dragon's Mate</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >Red Planet Dragons of Tajss Series, Book 2</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Miranda-Martin/B01J7AUOS6?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_8_1">Miranda Martin</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchAuthor=Juno+Wells&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_8_2">Juno Wells</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Tristan+James&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_8_1">Tristan James</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Jillian+Macie&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_8_2">Jillian Macie</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Red-Planet-Dragons-of-Tajss-Audiobooks/B0797MKS92?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_8_1">Red Planet Dragons of Tajss</a>, Book 2
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 6 hrs and 11 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    02-06-18
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >307 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-7" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-7" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-7" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-7" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-7" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-7" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-7" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-7" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-7" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-7" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-7" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-7" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}20.00
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-7" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}20.00</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
<div id="adbl-included-in-membership-container-7" class="bc-row
    bc-spacing-top-none
    bc-spacing-none
    bc-text-left"  style="">
  Included in Plus membership
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Dragons-Mate-Audiobook/B079585XKM?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Single Red Dragon'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B0CW8GGMB6" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B0CW8GGMB6' href="/pd/Single-Red-Dragon-Audiobook/B0CW8GGMB6?qid=1729753976&amp;sr=1-9&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_9">
<div class="adbl-asin-impression "
     data-asin="B0CW8GGMB6" data-widget="" data-position="9" data-face-out=""
     data-source="" data-url="/pd/Single-Red-Dragon-Audiobook/B0CW8GGMB6?qid=1729753976&amp;sr=1-9&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_9" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/41vkADbTUVL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/41vkADbTUVL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/41vkADbTUVL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/41vkADbTUVL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/41vkADbTUVL._SL500_.jpg"  loading="lazy"
                 alt="Single Red Dragon Audiobook By Michelle Ziegler cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/41vkADbTUVL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/41vkADbTUVL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B0CW8GGMB6" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Single Red Dragon" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Single Red Dragon</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        A Dragon Shifter Fated Mates Novel
</li>
<li class="bc-list-item" >
                        By:
                        Michelle Ziegler
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Virtual Voice
</li>
<li class="bc-list-item" >
                        Length: 4 hrs and 37 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            1
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            1
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            1
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        Lilly’s freed from her curse by her dragon mate, but she needs to escape her nightmares before the shadows of her past consume her. She isn’t sure if a dragon can overcome her demons or if the demons will consume them both. Lilly: I’ve never been touched, it’s not safe. I'm dangerous, but then HE saved me. Everything within me is drawn to this dragon shifter. Only, I'm not willing to be his or anyone's. Now, my dragon needs my help and I’m not sure I have anything to give. Eadric: I saved her, or I thought I had. I finally found my mate and yet she won’t let me touch her. She ...
</p>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B0CW8GGMB6" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B0CW8GGMB6"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/vv/8001/032408/vv_8001_032408_sample.mp3"
              sample-asin="B0CW8GGMB6"
              sample-ajax-token="gh1wg/eJt9S7Ucuzx7fQQOYQBHccESCk4xuu6L0AAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Virtual Voice Sample for Single Red Dragon"
              data-play-label="Play Virtual Voice Sample for Single Red Dragon"
              data-pause-label="Pause Sample for Single Red Dragon"
              data-load-label="Loading Sample for Single Red Dragon"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Virtual Voice Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Single-Red-Dragon-Audiobook/B0CW8GGMB6?qid=1729753976&amp;sr=1-9&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_9">Single Red Dragon</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >A Dragon Shifter Fated Mates Novel</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchAuthor=Michelle+Ziegler&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_9_1">Michelle Ziegler</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/ep/virtual-voice?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_9_1">Virtual Voice</a>
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 4 hrs and 37 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    02-23-24
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >1 rating</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-8" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-8" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-8" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-8" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-8" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-8" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-8" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-8" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-8" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-8" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-8" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-8" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}8.99
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-8" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}8.99</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
<div id="adbl-included-in-membership-container-8" class="bc-row
    bc-spacing-top-none
    bc-spacing-none
    bc-text-left"  style="">
  Included in Plus membership
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Single-Red-Dragon-Audiobook/B0CW8GGMB6?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Red Rising'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B00I2VWW5U" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B00I2VWW5U' href="/pd/Red-Rising-Audiobook/B00I2VWW5U?qid=1729753976&amp;sr=1-10&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_10">
<div class="adbl-asin-impression "
     data-asin="B00I2VWW5U" data-widget="" data-position="10" data-face-out=""
     data-source="" data-url="/pd/Red-Rising-Audiobook/B00I2VWW5U?qid=1729753976&amp;sr=1-10&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_10" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51IM+e-toYL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51IM+e-toYL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51IM+e-toYL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51IM+e-toYL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51IM+e-toYL._SL500_.jpg"  loading="lazy"
                 alt="Red Rising Audiobook By Pierce Brown cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51IM+e-toYL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51IM+e-toYL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B00I2VWW5U" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Red Rising" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Red Rising</h2>
</li>
<li class="bc-list-item" >
                        By:
                        Pierce Brown
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Tim Gerard Reynolds
</li>
<li class="bc-list-item" >
                        Length: 16 hrs and 12 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            69,028
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            63,286
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            63,169
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        Darrow is a Red, a member of the lowest caste in the color-coded society of the future. Like his fellow Reds, he works all day, believing that he and his people are making the surface of Mars livable for future generations. Yet he spends his life willingly, knowing that his blood and sweat will one day result in a better world for his children. But Darrow and his kind have been betrayed. Soon he discovers that humanity reached the surface generations ago. Vast cities and sprawling parks spread across the planet.
</p>
<div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            HUMANS ARE ALWAY NEGOTIATING,
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Jim &quot;The Impatient&quot;</span>
                          on
                        01-30-15
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B00I2VWW5U" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B00I2VWW5U"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/reco/007511/bk_reco_007511_sample.mp3"
              sample-asin="B00I2VWW5U"
              sample-ajax-token="go4WPj5kPZtw+iP2tm++NGalzHNKnZqRtPk8bLcAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Red Rising"
              data-play-label="Play Sample for Red Rising"
              data-pause-label="Pause Sample for Red Rising"
              data-load-label="Loading Sample for Red Rising"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Red-Rising-Audiobook/B00I2VWW5U?qid=1729753976&amp;sr=1-10&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_10">Red Rising</a>
                            </h3>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Pierce-Brown/B00EDBZVNI?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_10_1">Pierce Brown</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Tim+Gerard+Reynolds&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_10_1">Tim Gerard Reynolds</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Red-Rising-Audiobooks/B00U1UJCU8?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_10_1">Red Rising</a>, Book 1
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 16 hrs and 12 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    01-28-14
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >69,028 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-9" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-9" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-9" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-9" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-9" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-9" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-9" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-9" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-9" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-9" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-9" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-9" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}25.79
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-9" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}25.79</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
<div id="adbl-included-in-membership-container-9" class="bc-row
    bc-spacing-top-none
    bc-spacing-none
    bc-text-left"  style="">
  Included in Plus membership
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Red-Rising-Audiobook/B00I2VWW5U?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Red Planet Dragons of Tajss'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B0C39B7XLH" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B0C39B7XLH' href="/pd/Red-Planet-Dragons-of-Tajss-Audiobook/B0C39B7XLH?qid=1729753976&amp;sr=1-11&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_11">
<div class="adbl-asin-impression "
     data-asin="B0C39B7XLH" data-widget="" data-position="11" data-face-out=""
     data-source="" data-url="/pd/Red-Planet-Dragons-of-Tajss-Audiobook/B0C39B7XLH?qid=1729753976&amp;sr=1-11&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_11" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51KpbDWhPTL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51KpbDWhPTL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51KpbDWhPTL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51KpbDWhPTL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51KpbDWhPTL._SL500_.jpg"  loading="lazy"
                 alt="Red Planet Dragons of Tajss Audiobook By Miranda Martin cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51KpbDWhPTL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51KpbDWhPTL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B0C39B7XLH" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Red Planet Dragons of Tajss" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Red Planet Dragons of Tajss</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        A SciFi Alien Romance
</li>
<li class="bc-list-item" >
                        By:
                        Miranda Martin
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Virtual Voice
</li>
<li class="bc-list-item" >
                        Length: 4 hrs and 37 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            7
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >3 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            7
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            7
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        A Science Fiction Suspense Romance Riley No one was supposed to know. And yet, I do. I know what's coming, and it's up to me to stop it. The survival of my entire race depends on me. Angota I've never doubted our cause. Until her. Until I find a secret plan that betrays everything my warrior race has ever stood for. Honor, respect, and treasuring our females. This alien female—this human woman—changes everything. Fans of Ruby Dixon, Honey Phillips, and Alana Khan will adore this hot scifi alien romance. Scroll Up and One-Click NOW to find out why The Red Planet Dragons of Tajss has been...
</p>
<div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >3 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            Next
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Kindle Customer</span>
                          on
                        04-17-24
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B0C39B7XLH" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B0C39B7XLH"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/vv/8001/004180/vv_8001_004180_sample.mp3"
              sample-asin="B0C39B7XLH"
              sample-ajax-token="gnjeQIIGnwO3jwS+mFRMU57D4atmkC7ABz7W+l4AAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Virtual Voice Sample for Red Planet Dragons of Tajss"
              data-play-label="Play Virtual Voice Sample for Red Planet Dragons of Tajss"
              data-pause-label="Pause Sample for Red Planet Dragons of Tajss"
              data-load-label="Loading Sample for Red Planet Dragons of Tajss"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Virtual Voice Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Red-Planet-Dragons-of-Tajss-Audiobook/B0C39B7XLH?qid=1729753976&amp;sr=1-11&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_11">Red Planet Dragons of Tajss</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >A SciFi Alien Romance</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchAuthor=Miranda+Martin&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_11_1">Miranda Martin</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/ep/virtual-voice?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_11_1">Virtual Voice</a>
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 4 hrs and 37 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    01-09-24
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >7 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-10" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-10" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-10" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-10" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-10" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-10" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-10" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-10" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-10" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-10" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-10" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-10" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}6.99
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-10" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}6.99</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
<div id="adbl-included-in-membership-container-10" class="bc-row
    bc-spacing-top-none
    bc-spacing-none
    bc-text-left"  style="">
  Included in Plus membership
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Red-Planet-Dragons-of-Tajss-Audiobook/B0C39B7XLH?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='The Red Dragon Girl'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-1541419359" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-1541419359' href="/pd/The-Red-Dragon-Girl-Audiobook/1541419359?qid=1729753976&amp;sr=1-12&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_12">
<div class="adbl-asin-impression "
     data-asin="1541419359" data-widget="" data-position="12" data-face-out=""
     data-source="" data-url="/pd/The-Red-Dragon-Girl-Audiobook/1541419359?qid=1729753976&amp;sr=1-12&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_12" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51MU4-goAXL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51MU4-goAXL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51MU4-goAXL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51MU4-goAXL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51MU4-goAXL._SL500_.jpg"  loading="lazy"
                 alt="The Red Dragon Girl Audiobook By Lea Dou&eacute; cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51MU4-goAXL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51MU4-goAXL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-1541419359" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-The Red Dragon Girl" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >The Red Dragon Girl</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        Firethorn Chronicles Series, Book 3
</li>
<li class="bc-list-item" >
                        By:
                        Lea Doué
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Zehra Jane Naqvi
</li>
<li class="bc-list-item" >
                        Length: 7 hrs and 7 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            5
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            4
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            4
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        <p>Princess Melantha is done with court life. After suffering humiliation at her sister's wedding, she's determined to find her place outside palace walls and far away from fickle princes. Hearing rumors of a curse breakable only by a red-haired girl, she says goodbye to her eleven sisters and sets out on her own. But events don't unfold as planned, and she is caught up in a grueling journey through a distant kingdom with friends both old and new in a race for survival. </p>
        </p>
        <div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            Several dragon girls
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >🐺 SCARLET PIMPERNEL 🐺</span>
                          on
                        04-24-20
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-1541419359" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-1541419359"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/tant/020484/bk_tant_020484_sample.mp3"
              sample-asin="1541419359"
              sample-ajax-token="ghm+XD8UNm3dODeQS79mVIAtZRN96errdU6VHg0AAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for The Red Dragon Girl"
              data-play-label="Play Sample for The Red Dragon Girl"
              data-pause-label="Pause Sample for The Red Dragon Girl"
              data-load-label="Loading Sample for The Red Dragon Girl"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/The-Red-Dragon-Girl-Audiobook/1541419359?qid=1729753976&amp;sr=1-12&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_12">The Red Dragon Girl</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >Firethorn Chronicles Series, Book 3</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Lea-Doue/B016HLUAXW?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_12_1">Lea Doué</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Zehra+Jane+Naqvi&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_12_1">Zehra Jane Naqvi</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Firethorn-Chronicles-Series-Audiobooks/B084SQNK31?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_12_1">Firethorn Chronicles Series</a>, Book 3
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 7 hrs and 7 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    04-14-20
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >5 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-11" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-11" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-11" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-11" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-11" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-11" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-11" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-11" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-11" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-11" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-11" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-11" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}17.19
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-11" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}17.19</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
<div id="adbl-included-in-membership-container-11" class="bc-row
    bc-spacing-top-none
    bc-spacing-none
    bc-text-left"  style="">
  Included in Plus membership
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/The-Red-Dragon-Girl-Audiobook/1541419359?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Dragon of the Red Dawn'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B002V1M44Q" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B002V1M44Q' href="/pd/Dragon-of-the-Red-Dawn-Audiobook/B002V1M44Q?qid=1729753976&amp;sr=1-13&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_13">
<div class="adbl-asin-impression "
     data-asin="B002V1M44Q" data-widget="" data-position="13" data-face-out=""
     data-source="" data-url="/pd/Dragon-of-the-Red-Dawn-Audiobook/B002V1M44Q?qid=1729753976&amp;sr=1-13&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_13" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/61grwiFG4kL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61grwiFG4kL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/61grwiFG4kL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61grwiFG4kL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/61grwiFG4kL._SL500_.jpg"  loading="lazy"
                 alt="Dragon of the Red Dawn Audiobook By Mary Pope Osborne cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/61grwiFG4kL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61grwiFG4kL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B002V1M44Q" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Dragon of the Red Dawn" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Dragon of the Red Dawn</h2>
</li>
<li class="bc-list-item" >
                        By:
                        Mary Pope Osborne
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Mary Pope Osborne
</li>
<li class="bc-list-item" >
                        Length: 1 hr and 16 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            118
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            71
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            72
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        Merlin the Magician will not eat or sleep or speak to anyone in Camelot. What can be done? The enchantress Morgan knows who to ask for help: young Jack and Annie of Frog Creek, Pennsylvania! The brother-and-sister team quickly head off in the magic tree house on another magical and historical adventure.
</p>
<div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            Great Book
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Ladyhawk 24</span>
                          on
                        04-14-21
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B002V1M44Q" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B002V1M44Q"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/lili/000617/bk_lili_000617_sample.mp3"
              sample-asin="B002V1M44Q"
              sample-ajax-token="gluSqM+53dqKaPbZ4QHT/XfuvlW2FJGCIO/hVdsAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Dragon of the Red Dawn"
              data-play-label="Play Sample for Dragon of the Red Dawn"
              data-pause-label="Pause Sample for Dragon of the Red Dawn"
              data-load-label="Loading Sample for Dragon of the Red Dawn"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Dragon-of-the-Red-Dawn-Audiobook/B002V1M44Q?qid=1729753976&amp;sr=1-13&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_13">Dragon of the Red Dawn</a>
                            </h3>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Mary-Pope-Osborne/B000AQ78VS?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_13_1">Mary Pope Osborne</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Mary+Pope+Osborne&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_13_1">Mary Pope Osborne</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Magic-Tree-House-Merlin-Mission-Audiobooks/B01D3RGFEQ?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_13_1">Magic Tree House Merlin Mission</a>, Book 9
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 1 hr and 16 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    05-08-07
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >118 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-12" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-12" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-12" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-12" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-12" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-12" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-12" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-12" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-12" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-12" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-12" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-12" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}7.20
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-12" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}7.20</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Dragon-of-the-Red-Dawn-Audiobook/B002V1M44Q?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Red Dragon'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B0032N4VCK" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B0032N4VCK' href="/pd/Red-Dragon-Audiobook/B0032N4VCK?qid=1729753976&amp;sr=1-14&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_14">
<div class="adbl-asin-impression "
     data-asin="B0032N4VCK" data-widget="" data-position="14" data-face-out=""
     data-source="" data-url="/pd/Red-Dragon-Audiobook/B0032N4VCK?qid=1729753976&amp;sr=1-14&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_14" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/516ld286YBL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/516ld286YBL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/516ld286YBL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/516ld286YBL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/516ld286YBL._SL500_.jpg"  loading="lazy"
                 alt="Red Dragon Audiobook By Thomas Harris cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/516ld286YBL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/516ld286YBL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B0032N4VCK" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Red Dragon" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Red Dragon</h2>
</li>
<li class="bc-list-item" >
                        By:
                        Thomas Harris
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Thomas Harris
</li>
<li class="bc-list-item" >
                        Length: 3 hrs and 15 mins
</li>
<li class="bc-list-item" >
                    Abridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            37
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            30
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            29
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        Sexual hunger; demonic violence; sinister logic; the lethal components of a deadly formula driving a psychopath in the grip of an unimaginable delusion; a boastful killer who sends the police tormenting notes; a tortured, torturing monster who finds ultimate pleasure in viciously murdering happy families, and calls himself The Red Dragon.
</p>
<div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >3 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            A good listen - but where's the rest?
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Shannyn Campbell</span>
                          on
                        06-10-13
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B0032N4VCK" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B0032N4VCK"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/rhuk/000079/bk_rhuk_000079_sample.mp3"
              sample-asin="B0032N4VCK"
              sample-ajax-token="gqo7LIrr1vvV0Xro6G36agP9kE2NFHD+j2MJtLgAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Red Dragon"
              data-play-label="Play Sample for Red Dragon"
              data-pause-label="Pause Sample for Red Dragon"
              data-load-label="Loading Sample for Red Dragon"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Red-Dragon-Audiobook/B0032N4VCK?qid=1729753976&amp;sr=1-14&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_14">Red Dragon</a>
                            </h3>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Thomas-Harris/B000AQ28TK?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_14_1">Thomas Harris</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Thomas+Harris&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_14_1">Thomas Harris</a>
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 3 hrs and 15 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    01-18-06
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >37 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-13" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-13" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-13" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-13" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-13" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-13" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-13" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-13" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-13" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-13" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-13" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-13" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}15.32
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-13" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}15.32</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Red-Dragon-Audiobook/B0032N4VCK?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Dragon&apos;s Love'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B079ZN5FBK" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B079ZN5FBK' href="/pd/Dragons-Love-Audiobook/B079ZN5FBK?qid=1729753976&amp;sr=1-15&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_15">
<div class="adbl-asin-impression "
     data-asin="B079ZN5FBK" data-widget="" data-position="15" data-face-out=""
     data-source="" data-url="/pd/Dragons-Love-Audiobook/B079ZN5FBK?qid=1729753976&amp;sr=1-15&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_15" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/61I-4voJsnL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61I-4voJsnL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/61I-4voJsnL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61I-4voJsnL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/61I-4voJsnL._SL500_.jpg"  loading="lazy"
                 alt="Dragon's Love Audiobook By Juno Wells, Miranda Martin cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/61I-4voJsnL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61I-4voJsnL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B079ZN5FBK" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Dragon's Love" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Dragon's Love</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        Red Planet Dragons of Tajss Series, Book 3
</li>
<li class="bc-list-item" >
                        By:
                        Juno Wells, Miranda Martin
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Jillian Macie, Tristan James
</li>
<li class="bc-list-item" >
                        Length: 7 hrs and 19 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            232
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            212
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            213
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        <p>I guess I'm one of the last survivors of the human race, and I'm stranded on this hell of a desert alien planet. Sucks to be me. Our ship crashed months ago, and those of us left are struggling to survive the boiling heat in barbaric living conditions. The only reason we're not all dead is one of my friends got knocked up by a native alien, and he lets us live in his ruined city. </p>
        </p>
        <div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >1 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            Half of the book shows her I love with another man
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Laura</span>
                          on
                        05-21-19
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B079ZN5FBK" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B079ZN5FBK"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/tant/010334/bk_tant_010334_sample.mp3"
              sample-asin="B079ZN5FBK"
              sample-ajax-token="giqO2tahPTf1g1nDJ/FTox/j38vJ0qvFnxRjxHMAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Dragon&amp;apos;s Love"
              data-play-label="Play Sample for Dragon&amp;apos;s Love"
              data-pause-label="Pause Sample for Dragon&amp;apos;s Love"
              data-load-label="Loading Sample for Dragon&amp;apos;s Love"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Dragons-Love-Audiobook/B079ZN5FBK?qid=1729753976&amp;sr=1-15&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_15">Dragon's Love</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >Red Planet Dragons of Tajss Series, Book 3</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchAuthor=Juno+Wells&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_15_1">Juno Wells</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Miranda-Martin/B01J7AUOS6?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_15_2">Miranda Martin</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Jillian+Macie&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_15_1">Jillian Macie</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Tristan+James&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_15_2">Tristan James</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Red-Planet-Dragons-of-Tajss-Audiobooks/B0797MKS92?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_15_1">Red Planet Dragons of Tajss</a>, Book 3
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 7 hrs and 19 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    03-06-18
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >232 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-14" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-14" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-14" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-14" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-14" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-14" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-14" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-14" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-14" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-14" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-14" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-14" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}13.75
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-14" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}13.75</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
<div id="adbl-included-in-membership-container-14" class="bc-row
    bc-spacing-top-none
    bc-spacing-none
    bc-text-left"  style="">
  Included in Plus membership
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Dragons-Love-Audiobook/B079ZN5FBK?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='The Red Dragon'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B00M8E4L92" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B00M8E4L92' href="/pd/The-Red-Dragon-Audiobook/B00M8E4L92?qid=1729753976&amp;sr=1-16&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_16">
<div class="adbl-asin-impression "
     data-asin="B00M8E4L92" data-widget="" data-position="16" data-face-out=""
     data-source="" data-url="/pd/The-Red-Dragon-Audiobook/B00M8E4L92?qid=1729753976&amp;sr=1-16&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_16" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/61JedpYWcUL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61JedpYWcUL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/61JedpYWcUL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61JedpYWcUL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/61JedpYWcUL._SL500_.jpg"  loading="lazy"
                 alt="The Red Dragon Audiobook By L. Ron Hubbard cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/61JedpYWcUL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/61JedpYWcUL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B00M8E4L92" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-The Red Dragon" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >The Red Dragon</h2>
</li>
<li class="bc-list-item" >
                        By:
                        L. Ron Hubbard
</li>
<li class="bc-list-item" >
                        Narrated by:
                        R. F. Daley, Erika Christensen, Jim Meskimen, and others
</li>
<li class="bc-list-item" >
                        Length: 2 hrs and 5 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            4
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            3
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            3
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        <p>As a lieutenant in the US Marine Corps, Michael Stuart was once considered an officer and a gentleman. But that’s all changed. Now he’s seen as a renegade, a traitor, and a thief. Stuart is a man without a country...and perhaps without a prayer. Why? Because in a daring plot to foil the Japanese puppet regime in China, he set out to reinstate the country’s true emperor. Known now as <i>The Red Dragon</i>, Stuart is a soldier of fortune in war-torn Manchuria - and a man of honor in a world of treachery.</p>
        </p>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B00M8E4L92" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B00M8E4L92"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/gala/000120/bk_gala_000120_sample.mp3"
              sample-asin="B00M8E4L92"
              sample-ajax-token="gvwXbn47kjoYsdII7qFXf4OzvgjWHXV7Nc/4fsAAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for The Red Dragon"
              data-play-label="Play Sample for The Red Dragon"
              data-pause-label="Pause Sample for The Red Dragon"
              data-load-label="Loading Sample for The Red Dragon"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/The-Red-Dragon-Audiobook/B00M8E4L92?qid=1729753976&amp;sr=1-16&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_16">The Red Dragon</a>
                            </h3>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/L-Ron-Hubbard/B000AP9H6S?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_16_1">L. Ron Hubbard</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=R.+F.+Daley&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_16_1">R. F. Daley</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Erika+Christensen&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_16_2">Erika Christensen</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Jim+Meskimen&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_16_3">Jim Meskimen</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=John+Mariano&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_16_4">John Mariano</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Bob+Caso&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_16_5">Bob Caso</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Action-Adventure-Short-Stories-Collection-Audiobooks/B08GLQYSD2?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_16_1">Action Adventure Short Stories Collection</a>, Book 10
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 2 hrs and 5 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    07-30-14
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >4 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-15" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-15" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-15" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-15" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-15" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-15" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-15" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-15" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-15" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-15" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-15" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-15" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}13.00
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-15" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}13.00</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/The-Red-Dragon-Audiobook/B00M8E4L92?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Larry Bond&apos;s Red Dragon Rising: Shadows of War'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B002V1BGKO" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B002V1BGKO' href="/pd/Larry-Bonds-Red-Dragon-Rising-Shadows-of-War-Audiobook/B002V1BGKO?qid=1729753976&amp;sr=1-17&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_17">
<div class="adbl-asin-impression "
     data-asin="B002V1BGKO" data-widget="" data-position="17" data-face-out=""
     data-source="" data-url="/pd/Larry-Bonds-Red-Dragon-Rising-Shadows-of-War-Audiobook/B002V1BGKO?qid=1729753976&amp;sr=1-17&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_17" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51w5IHudavL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51w5IHudavL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51w5IHudavL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51w5IHudavL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51w5IHudavL._SL500_.jpg"  loading="lazy"
                 alt="Larry Bond's Red Dragon Rising: Shadows of War Audiobook By Larry Bond, Jim DeFelice cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51w5IHudavL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51w5IHudavL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B002V1BGKO" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Larry Bond's Red Dragon Rising: Shadows of War" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Larry Bond's Red Dragon Rising: Shadows of War</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        Red Dragon, Book 1
</li>
<li class="bc-list-item" >
                        By:
                        Larry Bond, Jim DeFelice
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Luke Daniels
</li>
<li class="bc-list-item" >
                        Length: 15 hrs
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            244
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            194
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            192
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        In the not-too-distant future, massive climate change has wracked the globe. China's rice-growing regions have been devastated by typhoons, while its western breadbasket is suffering from three years of drought. Riots threaten to tear the country apart. With the old-guard Chinese government paralyzed by the crisis, a young, charismatic party leader steps to the fore. His solution to the unrest is a time-tested one - conquest of China's neighbors and, after that, the world.
</p>
<div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >1 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            don't Buy it!
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >F.</span>
                          on
                        03-23-10
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B002V1BGKO" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B002V1BGKO"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/brll/001918/bk_brll_001918_sample.mp3"
              sample-asin="B002V1BGKO"
              sample-ajax-token="ggr1+CZlKJjGRE0F0lxuB2B45Mf62EHluoZ/p6AAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Larry Bond&amp;apos;s Red Dragon Rising: Shadows of War"
              data-play-label="Play Sample for Larry Bond&amp;apos;s Red Dragon Rising: Shadows of War"
              data-pause-label="Pause Sample for Larry Bond&amp;apos;s Red Dragon Rising: Shadows of War"
              data-load-label="Loading Sample for Larry Bond&amp;apos;s Red Dragon Rising: Shadows of War"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Larry-Bonds-Red-Dragon-Rising-Shadows-of-War-Audiobook/B002V1BGKO?qid=1729753976&amp;sr=1-17&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_17">Larry Bond's Red Dragon Rising: Shadows of War</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >Red Dragon, Book 1</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Larry-Bond/B00IYZZG1G?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_17_1">Larry Bond</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Jim-DeFelice/B001ILHFAS?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_17_2">Jim DeFelice</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Luke+Daniels&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_17_1">Luke Daniels</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/Red-Dragon-Rising-Audiobooks/B005NB1HCG?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_17_1">Red Dragon Rising</a>, Book 1
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 15 hrs</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    11-10-09
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >244 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-16" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-16" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-16" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-16" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-16" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-16" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-16" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-16" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-16" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-16" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-16" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-16" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}25.00
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-16" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}25.00</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Larry-Bonds-Red-Dragon-Rising-Shadows-of-War-Audiobook/B002V1BGKO?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Operation Red Dragon and the Unthinkable'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B07BZVQJHM" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B07BZVQJHM' href="/pd/Operation-Red-Dragon-and-the-Unthinkable-Audiobook/B07BZVQJHM?qid=1729753976&amp;sr=1-18&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_18">
<div class="adbl-asin-impression "
     data-asin="B07BZVQJHM" data-widget="" data-position="18" data-face-out=""
     data-source="" data-url="/pd/Operation-Red-Dragon-and-the-Unthinkable-Audiobook/B07BZVQJHM?qid=1729753976&amp;sr=1-18&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_18" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/6119wplNCzL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/6119wplNCzL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/6119wplNCzL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/6119wplNCzL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/6119wplNCzL._SL500_.jpg"  loading="lazy"
                 alt="Operation Red Dragon and the Unthinkable Audiobook By James Rosone, Miranda Watson cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/6119wplNCzL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/6119wplNCzL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B07BZVQJHM" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Operation Red Dragon and the Unthinkable" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Operation Red Dragon and the Unthinkable</h2>
</li>
<li class="bc-list-item
    bc-spacing-micro
    bc-size-base
	bc-color-base" >
                        World War III Series, Book 2
</li>
<li class="bc-list-item" >
                        By:
                        James Rosone, Miranda Watson
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Alex Hyde-White Punch Audio
</li>
<li class="bc-list-item" >
                        Length: 8 hrs and 19 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            354
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            320
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            322
</div>
</div>
</li>
            </ul>
</span>
<p  class="bc-text
    bc-spacing-small
    bc-spacing-top-none
    bc-size-small
    bc-color-base">
                        <p>This book is a continuation of the World War III series, an Amazon top-selling series. See what happens to America when the country refuses to surrender their forces in the Middle East and capitulate to the Caliphate’s demands. In this second installment of James Rosone and Miranda Watson’s World War III series, we discover the fate of New York City as the Islamic Republic steers a freighter into New York Harbor. Join the authors as they walk us through the final battles in Israel that will transform the Middle East for generations. </p>
        </p>
        <div  class="bc-divider
    bc-spacing-small
    bc-divider-secondary">
</div>
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-size-base
    bc-text-bold
    bc-text-quote" >
                            Where is the sequel I hate when audible do this. Incomplete!!
                        </h2>
</li>
<li class="bc-list-item
    bc-size-mini
	bc-color-secondary" >
                        By
<span class="bc-text
    bc-color-base"  >Ingrid  C Dark</span>
                          on
                        04-17-18
</li>
                </ul>
</span>
    </div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-top-s1
    bc-col-12">
<div data-trigger="sample-player-B07BZVQJHM" class="bc-trigger
bc-pub-inline
bc-trigger-playerbutton">
    <span id="sample-player-B07BZVQJHM"
          class="bc-button
  bc-button-secondary
  bc-button-player bc-button-audio-has-countdown
  bc-button-small">
      <button class="bc-button-text"
              data-mp3="https://samples.audible.com/bk/acx0/113070/bk_acx0_113070_sample.mp3"
              sample-asin="B07BZVQJHM"
              sample-ajax-token="givVi2dw13oOz4r5m7sVYNa00WuO8CyvuV9I8FYAAAABAAAAAGcZ83hyYXcAAAAAFVfwRGgNifE9xfqJS///"
              sample-content-source="SearchResults"
              aria-label="Play Sample for Operation Red Dragon and the Unthinkable"
              data-play-label="Play Sample for Operation Red Dragon and the Unthinkable"
              data-pause-label="Pause Sample for Operation Red Dragon and the Unthinkable"
              data-load-label="Loading Sample for Operation Red Dragon and the Unthinkable"  type="button" tabindex="0">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-pause-s2
	bc-button-player-icon-pause bc-button-player-icon bc-hidden
	bc-icon-pause
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-play-s2
	bc-button-player-icon-play bc-button-player-icon
	bc-icon-play
	bc-color-base" >
</i>
<span class="bc-text
    bc-button-player-label-play"  >
                 Sample
             </span>
<span class="bc-text
    bc-button-audio-countdown-text bc-hidden"  ></span>
        <img id="" class="bc-button-loading-state bc-hidden bc-button-player-image
bc-button-player-loading-small js-only-element" src="https://m.media-amazon.com/images/G/01/audibleweb/brickcity/1.0/player/spinner/spinner-black._V533714622_.svg" style="vertical-align: middle"
             role='status' />
  </span>
      </button>
    </span>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-6">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<span>
 	<ul  class="bc-list
    bc-list-nostyle">
<li class="bc-list-item" >
<h3  class="bc-heading
    bc-color-link
    bc-pub-break-word
    bc-size-medium" >
                                  <a class="bc-link
    bc-color-link" tabindex="0"  href="/pd/Operation-Red-Dragon-and-the-Unthinkable-Audiobook/B07BZVQJHM?qid=1729753976&amp;sr=1-18&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_18">Operation Red Dragon and the Unthinkable</a>
                            </h3>
</li>
<li class="bc-list-item
	subtitle" >
<span class="bc-text
    bc-size-base
    bc-color-secondary"  >World War III Series, Book 2</span>
</li>
<li class="bc-list-item
	authorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                    By:
                                    <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/James-Rosone/B00JKR8SRG?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_18_1">James Rosone</a>, <a class="bc-link
    bc-color-link" tabindex="0"  href="/author/Miranda-Watson/B0196Z7S4U?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lAuthor_1_18_2">Miranda Watson</a>
                                  </span>
</li>
<li class="bc-list-item
	narratorLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Narrated by:
                                      <a class="bc-link
    bc-color-link" tabindex="0"  href="/search?searchNarrator=Alex+Hyde-White+Punch+Audio&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lNarrator_1_18_1">Alex Hyde-White Punch Audio</a>
                                    </span>
</li>
<li class="bc-list-item
	seriesLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >
                                      Series:
        <a class="bc-link
    bc-color-link" tabindex="0"  href="/series/World-War-III-Audiobooks/B07CBZ43QF?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lSeries_1_18_1">World War III</a>, Book 2
                                    </span>
</li>
<li class="bc-list-item
	runtimeLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Length: 8 hrs and 19 mins</span>
</li>
<li class="bc-list-item
	releaseDateLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Release date:
                                    04-09-18
                                  </span>
</li>
<li class="bc-list-item
	languageLabel" >
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >Language:
                                      English
                                    </span>
</li>
<li class="bc-list-item
	ratingsLabel" >
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-text
    bc-size-small
    bc-color-secondary"  >354 ratings</span>
</li>
<li class="bc-list-item
	mostPopularLabel" >
</li>
<li class="bc-list-item
	trendingLabel" >
</li>
                        </ul>
</span>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-col-4">
<div id="adbl-buy-box-area" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxArea" style="" >
<div id="adbl-callto-action-container" class="bc-section
    bc-spacing-none
    bc-spacing-top-none
      bc-padding-none
      bc-padding-top-none
      adblCalltoActionContainer" style="" >
<div id="adbl-buy-box-container" class="bc-row-responsive
    adblBuyBoxContainer
    bc-spacing-top-small
    bc-spacing-none"   style="">
<div id=adbl-buy-box  class="bc-col-responsive
    adblBuyBox
    bc-spacing-none
    bc-spacing-top-none
    bc-col-12">
<div id="adbl-common-buybox-17" class="bc-box
			bc-box-padding-none
			adblCommonBuyBox
		bc-text-left"  >
<div id="adbl-buybox-area-17" class="bc-section
    bc-spacing-none
    bc-spacing-top-none" style="" >
<div id="adbl-buy-box-ajax-error-17" class="bc-section
    bc-spacing-mini
      bc-padding-none
      bc-padding-top-none
      adblBuyBoxAjaxError bc-hidden" style="" >
<div id="adbl-buy-box-cart-capacity-exceeded-error-alert-17" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartCapacityExceededErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Failed to add items
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Sorry, we are unable to add the item because your shopping cart is already at capacity.</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-cart-error-alert-17" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxCartErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Cart failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-add-to-wishlist-error-alert-17" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Add to Wish List failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-remove-from-wishlist-error-alert-17" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxRemoveFromWishlistErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Remove from wishlist failed.
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again later</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-discovery-aycl-error-alert-17" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxAddToLibraryErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Adding to library failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-follow-podcast-error-alert-17" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxFollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Follow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
<div id="adbl-buy-box-unfollow-podcast-error-alert-17" class="bc-box
		bc-palette-default" role='alert' >
        <div class="bc-box-padding-small
		bc-color-secondary
		bc-inline-alert-error
    adblBuyBoxUnfollowPodcastErrorAlert bc-hidden
      bc-color-background-base"  >
<div id="" class="bc-row-responsive
    bc-spacing-none"   style="">
<div   class="bc-col-responsive
    bc-text-right
    bc-col-1">
            <i aria-hidden="true" class="bc-icon
	bc-icon-fill-error
	bc-icon-exclamation-triangle-s2
	bc-icon-exclamation-triangle
	bc-icon-size-small
	bc-color-error" >
</i>
</div>
<div   class="bc-col-responsive
    bc-col-11">
<div  class="bc-section" style="" >
                <h2  class="bc-heading
    bc-color-error
    bc-size-base
    bc-text-bold" >
                Unfollow podcast failed
            </h2>
</div>
<div  class="bc-section
    bc-spacing-top-micro" style="" >
<span class="bc-text
    bc-color-base"  >
<span class="bc-text"  >Please try again</span>
                    </span>
</div>
</div>
</div>
        </div>
</div>
</div>
<div id="" class="bc-row
    bc-spacing-top-none"  style="">
<div id="adbl-buy-box-price-17" class="bc-section
    bc-spacing-none
      adblBuyBoxPrice" style="" >
<p id="buybox-regular-price-17" class="bc-text
    buybox-regular-price
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Regular price: </span>
<span class="bc-text
    bc-size-base
    bc-color-base"  >
            _{'_'}19.95
        </span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
<p id="buybox-member-price-17" class="bc-text
    buybox-member-price bc-hidden
    bc-spacing-none
    bc-spacing-top-none
    bc-text-left">
<span class="bc-text
    bc-size-base
    bc-color-base"  >Sale price:</span>
<span class="bc-text
    bc-size-base
    bc-color-price"  >_{'_'}19.95</span>
<span class="bc-text
    adblBuyBoxCreditCost bc-hidden
    bc-color-base" id="adbl_buybox_credit_cost" >
            or 1 credit
        </span>
</p>
</div>
    <!-- include nested components -->
</div>
<div id="" class="bc-row
    bc-spacing-top-micro"  style="">
    <span class="bc-button
  bc-button-primary
  bc-spacing-top-mini
  bc-button-small">
      <a class="bc-button-text"  href="/pd/Operation-Red-Dragon-and-the-Unthinkable-Audiobook/B07BZVQJHM?ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_a_list_product-0" tabindex="0" role="button">
        <span class="bc-text
    bc-button-text-inner
    bc-size-action-small"  >
  Try for _{'_'}0.00
  </span>
      </a>
    </span>
    <!-- include nested components -->
    <!-- include nested components -->
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div   class="bc-col-responsive
    bc-spacing-base
    bc-spacing-top-base
    bc-col-12">
<div  class="bc-divider
    bc-divider-secondary">
</div>
</div>
</div>
</li>
<li class="bc-list-item
	productListItem" aria-label='Grey Dragons: Red Ascendant'>
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-spacing-top-none
    bc-col-8">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-5">
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-12">
<div data-trigger="product-list-flyout-B0CTN2WCQV" class="bc-trigger
bc-pub-block
bc-trigger-popover">
            <a class="bc-link
    bc-color-link" tabindex="0" aria-hidden='false' aria-describedby='product-list-flyout-B0CTN2WCQV' href="/pd/Grey-Dragons-Red-Ascendant-Audiobook/B0CTN2WCQV?qid=1729753976&amp;sr=1-19&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_19">
<div class="adbl-asin-impression "
     data-asin="B0CTN2WCQV" data-widget="" data-position="19" data-face-out=""
     data-source="" data-url="/pd/Grey-Dragons-Red-Ascendant-Audiobook/B0CTN2WCQV?qid=1729753976&amp;sr=1-19&ref_pageloadid=not_applicable&pf_rd_p=83218cca-c308-412f-bfcf-90198b687a2f&pf_rd_r=V10HB73DED0WS1AXR5H3&pageLoadId=4H3fralOLYeTvD2t&creativeId=0d6f6720-f41c-457e-a42b-8c8dceb62f2c&ref=a_search_c3_lProduct_1_19" >
                    <div>
            <picture>
                <source type="image/webp" srcset="https://m.media-amazon.com/images/I/51D9LDt0xCL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51D9LDt0xCL._SL500_.jpg  2x" />
              <source type="image/jpg" srcset="https://m.media-amazon.com/images/I/51D9LDt0xCL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51D9LDt0xCL._SL500_.jpg
     2x" />
            <img id="" class="bc-pub-block
    bc-image-inset-border js-only-element" src="https://m.media-amazon.com/images/I/51D9LDt0xCL._SL500_.jpg"  loading="lazy"
                 alt="Grey Dragons: Red Ascendant Audiobook By Olan Prentice cover art"
                 width="100%"
                 srcset="https://m.media-amazon.com/images/I/51D9LDt0xCL._SL250_.jpg 1x,
    https://m.media-amazon.com/images/I/51D9LDt0xCL._SL500_.jpg
     2x" />
          </picture>
        </div>
</div>
            </a>
</div>
<div id="product-list-flyout-B0CTN2WCQV" class="bc-popover bc-hidden
    bc-palette-default" role="tooltip" aria-label="popover-Grey Dragons: Red Ascendant" data-popover-position="right" data-width=320 data-hoverable="false" data-bodyLevel="true">
    <span class="bc-popover-beak"></span>
    <div class="bc-popover-inner" style="">
<span>
 	<ul  class="bc-list
	bc-pub-overflow-hidden
    bc-spacing-small
    bc-size-small
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<h2  class="bc-heading
    bc-color-base
    bc-text-bold" >Grey Dragons: Red Ascendant</h2>
</li>
<li class="bc-list-item" >
                        By:
                        Olan Prentice
</li>
<li class="bc-list-item" >
                        Narrated by:
                        Nick Cracknell
</li>
<li class="bc-list-item" >
                        Length: 17 hrs and 16 mins
</li>
<li class="bc-list-item" >
                    Unabridged
</li>
            </ul>
</span>
<span>
 	<ul  class="bc-list
    bc-spacing-small
    bc-size-mini
    bc-color-secondary
    bc-list-nostyle">
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Overall
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            7
</div>
</div>
</li>
<li class="bc-list-item
    bc-spacing-micro" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Performance
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            6
</div>
</div>
</li>
<li class="bc-list-item" >
<div id="" class="bc-row-responsive"   style="">
<div   class="bc-col-responsive
    bc-col-4">
                            Story
</div>
<div   class="bc-col-responsive
    bc-col-8">
<div class="bc-review-stars">
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
      <span class="full-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-fill-s2
	bc-icon-star-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
      </span>
     <span class="half-review-star">
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-base
	bc-icon-star-empty-s2
	bc-icon-star-empty
	bc-icon-size-small
	bc-color-base" >
</i>
<i aria-hidden="true" class="bc-icon
	bc-icon-fill-progress
	bc-icon-star-left-fill-s2
	bc-icon-star-left-fill
	bc-icon-size-small
	bc-color-progress" >
</i>
     </span>
</div>
<span class="bc-text
    bc-pub-offscreen"  >4.5 out of 5 stars</span>
<span class="bc-letter-space bc-letter-space-mini"></span>
                            6
</div>
</div>
</li>
            </ul>
</body>
</html>
    """
}