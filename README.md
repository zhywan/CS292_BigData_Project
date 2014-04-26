




<!DOCTYPE html>
<html class="   ">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    
    <title>Freelancer_Recommender_Algorithms/README.md at master · zhywan/Freelancer_Recommender_Algorithms</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="zhywan/Freelancer_Recommender_Algorithms" name="twitter:title" /><meta content="Freelancer_Recommender_Algorithms - CS292 Big Data Project" name="twitter:description" /><meta content="https://avatars2.githubusercontent.com/u/4327979?s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars2.githubusercontent.com/u/4327979?s=400" property="og:image" /><meta content="zhywan/Freelancer_Recommender_Algorithms" property="og:title" /><meta content="https://github.com/zhywan/Freelancer_Recommender_Algorithms" property="og:url" /><meta content="Freelancer_Recommender_Algorithms - CS292 Big Data Project" property="og:description" />

    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />

    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="47C7CF4E:3E08:9D8C5D:535B6179" name="octolytics-dimension-request_id" /><meta content="4327979" name="octolytics-actor-id" /><meta content="zhywan" name="octolytics-actor-login" /><meta content="7c1b0d2a7afad5bc387d6a3cb78f6275b981baa3cfb158fc9688234e6ea634cc" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="https://github.global.ssl.fastly.net/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="zgeDmtFVk7JKQuNAuR3jZAC3HLz8/tv6mHf8+LsYpLsUTMMhX5noLZXdnE5rbryeP/GuAyjet9iIMbrUS8CjwA==" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-cc557869fb9cdb388d66a57c972147dfcf6cc34f.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-1202793039fee08f007a3b9e0dd1192c81e4c31d.css" media="all" rel="stylesheet" type="text/css" />
    


        <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-59c02aa6b9ceb85ebef012f790bf56e9ed982fd2.js" type="text/javascript"></script>
        <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-0dce5cbbd453992693347ff7a62aa955cf152870.js" type="text/javascript"></script>
        
        
      <meta http-equiv="x-pjax-version" content="a85d0164c9fad6eb1b77c00cc27f69b3">

        <link data-pjax-transient rel='permalink' href='/zhywan/Freelancer_Recommender_Algorithms/blob/c0c3272191c3af0950941d5ca11e85aa56789115/README.md'>

  <meta name="description" content="Freelancer_Recommender_Algorithms - CS292 Big Data Project" />

  <meta content="4327979" name="octolytics-dimension-user_id" /><meta content="zhywan" name="octolytics-dimension-user_login" /><meta content="19169722" name="octolytics-dimension-repository_id" /><meta content="zhywan/Freelancer_Recommender_Algorithms" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="19169722" name="octolytics-dimension-repository_network_root_id" /><meta content="zhywan/Freelancer_Recommender_Algorithms" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/zhywan/Freelancer_Recommender_Algorithms/commits/master.atom" rel="alternate" title="Recent Commits to Freelancer_Recommender_Algorithms:master" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/">
  <span class="mega-octicon octicon-mark-github"></span>
</a>

    
    <a href="/notifications" aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s" data-gotokey="n">
        <span class="mail-status all-read"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<div class="commandbar">
  <span class="message"></span>
  <input type="text" data-hotkey="s, /" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="zhywan"
      data-repo="zhywan/Freelancer_Recommender_Algorithms"
      data-branch="master"
      data-sha="6daca62dcf92de38d32661d225022de43728b1c3"
  >
  <div class="display hidden"></div>
</div>

    <input type="hidden" name="nwo" value="zhywan/Freelancer_Recommender_Algorithms" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/zhywan" class="name">
        <img alt="zhywan" class=" js-avatar" data-user="4327979" height="20" src="https://avatars1.githubusercontent.com/u/4327979?s=140" width="20" /> zhywan
      </a>
    </li>

    <li class="new-menu dropdown-toggle js-menu-container">
      <a href="#" class="js-menu-target tooltipped tooltipped-s" aria-label="Create new...">
        <span class="octicon octicon-plus"></span>
        <span class="dropdown-arrow"></span>
      </a>

      <div class="new-menu-content js-menu-content">
      </div>
    </li>

    <li>
      <a href="/settings/profile" id="account_settings"
        class="tooltipped tooltipped-s"
        aria-label="Account settings ">
        <span class="octicon octicon-tools"></span>
      </a>
    </li>
    <li>
      <form class="logout-form" action="/logout" method="post">
        <button class="sign-out-button tooltipped tooltipped-s" aria-label="Sign out">
          <span class="octicon octicon-log-out"></span>
        </button>
      </form>
    </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo-create"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


    <li class="section-title">
      <span title="zhywan/Freelancer_Recommender_Algorithms">This repository</span>
    </li>
      <li>
        <a href="/zhywan/Freelancer_Recommender_Algorithms/issues/new"><span class="octicon octicon-issue-opened"></span> New issue</a>
      </li>
      <li>
        <a href="/zhywan/Freelancer_Recommender_Algorithms/settings/collaboration"><span class="octicon octicon-person-add"></span> New collaborator</a>
      </li>
</ul>

</div>


    
  </div>
</div>

      

        



      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="+GuYhLq5SDMFeNap11VTFkRRYW+79jLkpnkUO9TXKs6N1ndRO5rdL23YntQqepjhhzVsxndrtcPBWeO1pYwnLA==" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="19169722" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/zhywan/Freelancer_Recommender_Algorithms/watchers">
        1
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye-unwatch"></span>
          Unwatch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-watch"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
  

  <div class="js-toggler-container js-social-container starring-container ">
    <a href="/zhywan/Freelancer_Recommender_Algorithms/unstar"
      class="minibutton with-count js-toggler-target star-button starred"
      aria-label="Unstar this repository" title="Unstar zhywan/Freelancer_Recommender_Algorithms" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star-delete"></span><span class="text">Unstar</span>
    </a>

    <a href="/zhywan/Freelancer_Recommender_Algorithms/star"
      class="minibutton with-count js-toggler-target star-button unstarred"
      aria-label="Star this repository" title="Star zhywan/Freelancer_Recommender_Algorithms" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star"></span><span class="text">Star</span>
    </a>

      <a class="social-count js-social-count" href="/zhywan/Freelancer_Recommender_Algorithms/stargazers">
        0
      </a>
  </div>

  </li>


        <li>
          <a href="/zhywan/Freelancer_Recommender_Algorithms/fork" class="minibutton with-count js-toggler-target fork-button lighter tooltipped-n" title="Fork your own copy of zhywan/Freelancer_Recommender_Algorithms to your account" aria-label="Fork your own copy of zhywan/Freelancer_Recommender_Algorithms to your account" rel="nofollow" data-method="post">
            <span class="octicon octicon-git-branch-create"></span><span class="text">Fork</span>
          </a>
          <a href="/zhywan/Freelancer_Recommender_Algorithms/network" class="social-count">0</a>
        </li>


</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author"><a href="/zhywan" class="url fn" itemprop="url" rel="author"><span itemprop="title">zhywan</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/zhywan/Freelancer_Recommender_Algorithms" class="js-current-repository js-repo-home-link">Freelancer_Recommender_Algorithms</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/zhywan/Freelancer_Recommender_Algorithms" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-gotokey="c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /zhywan/Freelancer_Recommender_Algorithms">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

        <li class="tooltipped tooltipped-w" aria-label="Issues">
          <a href="/zhywan/Freelancer_Recommender_Algorithms/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="i" data-selected-links="repo_issues /zhywan/Freelancer_Recommender_Algorithms/issues">
            <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>

      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/zhywan/Freelancer_Recommender_Algorithms/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="p" data-selected-links="repo_pulls /zhywan/Freelancer_Recommender_Algorithms/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/zhywan/Freelancer_Recommender_Algorithms/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_wiki /zhywan/Freelancer_Recommender_Algorithms/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/zhywan/Freelancer_Recommender_Algorithms/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /zhywan/Freelancer_Recommender_Algorithms/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/zhywan/Freelancer_Recommender_Algorithms/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /zhywan/Freelancer_Recommender_Algorithms/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/zhywan/Freelancer_Recommender_Algorithms/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /zhywan/Freelancer_Recommender_Algorithms/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


      <div class="sunken-menu-separator"></div>
      <ul class="sunken-menu-group">
        <li class="tooltipped tooltipped-w" aria-label="Settings">
          <a href="/zhywan/Freelancer_Recommender_Algorithms/settings" aria-label="Settings" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_settings /zhywan/Freelancer_Recommender_Algorithms/settings">
            <span class="octicon octicon-tools"></span> <span class="full-word">Settings</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
      </ul>
  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=push">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/zhywan/Freelancer_Recommender_Algorithms.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/zhywan/Freelancer_Recommender_Algorithms.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=push">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:zhywan/Freelancer_Recommender_Algorithms.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="git@github.com:zhywan/Freelancer_Recommender_Algorithms.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=push">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/zhywan/Freelancer_Recommender_Algorithms" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/zhywan/Freelancer_Recommender_Algorithms" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>


  <a href="github-windows://openRepo/https://github.com/zhywan/Freelancer_Recommender_Algorithms" class="minibutton sidebar-button" title="Save zhywan/Freelancer_Recommender_Algorithms to your computer and use it in GitHub Desktop." aria-label="Save zhywan/Freelancer_Recommender_Algorithms to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/zhywan/Freelancer_Recommender_Algorithms/archive/master.zip"
                   class="minibutton sidebar-button"
                   aria-label="Download zhywan/Freelancer_Recommender_Algorithms as a zip file"
                   title="Download zhywan/Freelancer_Recommender_Algorithms as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:2583a04469b0184b0b6298fa24eb1008 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/zhywan/Freelancer_Recommender_Algorithms/find/master" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Find or create a branch…" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/zhywan/Freelancer_Recommender_Algorithms/blob/master/README.md"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <form accept-charset="UTF-8" action="/zhywan/Freelancer_Recommender_Algorithms/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-new-item-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="VEhnYzjIY7D5ar7Msk0jvEEZm3WFzHwfMFcJV0SH//Dcqx2p5K7LKbtXPkxlnRmIAL41m93D7J+UyKtfmU3SIQ==" /></div>
            <span class="octicon octicon-git-branch-create select-menu-item-icon"></span>
            <div class="select-menu-item-text">
              <h4>Create branch: <span class="js-new-item-name"></span></h4>
              <span class="description">from ‘master’</span>
            </div>
            <input type="hidden" name="name" id="name" class="js-new-item-value">
            <input type="hidden" name="branch" id="branch" value="master" />
            <input type="hidden" name="path" id="path" value="README.md" />
          </form> <!-- /.select-menu-item -->

      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/zhywan/Freelancer_Recommender_Algorithms" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">Freelancer_Recommender_Algorithms</span></a></span></span><span class="separator"> / </span><strong class="final-path">README.md</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="README.md" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit file-history-tease">
    <img alt="zhywan" class="main-avatar js-avatar" data-user="4327979" height="24" src="https://avatars1.githubusercontent.com/u/4327979?s=140" width="24" />
    <span class="author"><a href="/zhywan" rel="author">zhywan</a></span>
    <local-time datetime="2014-04-26T02:15:06-05:00" from="now" title-format="%Y-%m-%d %H:%M:%S %z" title="2014-04-26 02:15:06 -0500">April 26, 2014</local-time>
    <div class="commit-title">
        <a href="/zhywan/Freelancer_Recommender_Algorithms/commit/c9e4fa5aa6d60c4d1e3a31f50d84833d5303c889" class="message" data-pjax="true" title="Update README.md">Update README.md</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>1</strong>  contributor</a></p>
      
    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="zhywan" class=" js-avatar" data-user="4327979" height="24" src="https://avatars1.githubusercontent.com/u/4327979?s=140" width="24" />
            <a href="/zhywan">zhywan</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>78 lines (64 sloc)</span>
          <span class="meta-divider"></span>
        <span>5.183 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="github-windows://openRepo/https://github.com/zhywan/Freelancer_Recommender_Algorithms?branch=master&amp;filepath=README.md" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
                <a class="minibutton js-update-url-with-hash"
                   href="/zhywan/Freelancer_Recommender_Algorithms/edit/master/README.md"
                   data-method="post" rel="nofollow" data-hotkey="e">Edit</a>
          <a href="/zhywan/Freelancer_Recommender_Algorithms/raw/master/README.md" class="button minibutton " id="raw-url">Raw</a>
            <a href="/zhywan/Freelancer_Recommender_Algorithms/blame/master/README.md" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/zhywan/Freelancer_Recommender_Algorithms/commits/master/README.md" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->

            <a class="minibutton danger empty-icon"
               href="/zhywan/Freelancer_Recommender_Algorithms/delete/master/README.md"
               data-method="post" data-test-id="delete-blob-file" rel="nofollow">

          Delete
        </a>
      </div><!-- /.actions -->
    </div>
      
  <div id="readme" class="blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="mainContentOfPage"><h1>
<a name="user-content-freelancer_recommender_algorithms" class="anchor" href="#freelancer_recommender_algorithms"><span class="octicon octicon-link"></span></a>Freelancer_Recommender_Algorithms</h1>

<p>CS292 Big Data Project Team 9</p>

<p>Zhiyun Yin, Na Wang, Zhiyu Wan</p>

<h2>
<a name="user-content-package-contentbased-includes-4-java-files" class="anchor" href="#package-contentbased-includes-4-java-files"><span class="octicon octicon-link"></span></a>Package contentbased includes 4 java files.</h2>

<p>ProjectRecommender.java 
  implements content-based algorithm that recommend top k projects to each freelances.
Arguments:
  -o:Output file (default: "data/Content_based_recommendation_result.txt")
  -i:Input freelancer file which contians freelancers' names and top 5 skills associated with each freelancer. (default: "freelancerfile.txt")
  -p:Input project file which contains projects' names and top 5 skills associated with each project. (default: "projectfile.txt")</p>

<hr><p>InteractiveRecommender.java 
  implements content-based algorithm that recommend top k projects in an iteractive way.
Arguments:
  -i:Input freelancer file which contians freelancers' names and top 5 skills associated with each freelancer. (default: "freelancerfile.txt")
  -p:Input project file which contains projects' names and top 5 skills associated with each project. (default: "projectfile.txt")</p>

<hr><p>FreelancerRecommender.java 
  implements content-based algorithm that recommend top k freelancers to each project.
Arguments:
  -o:Output file (default: "data/Content_based_recommendation_result2.txt")
  -i:Input freelancer file which contians freelancers' names and top 5 skills associated with each freelancer. (default: "freelancerfile.txt")
  -p:Input project file which contains projects' names and top 5 skills associated with each project. (default: "projectfile.txt")</p>

<hr><p>Evaluator.java
  implements evaluatation methods for content-based algorithm and does some other things.
Arguments:
  -o:Output result file (default: "data/eval_result.txt")
  -i:Input freelancer file which contians freelancers' names and top 5 skills associated with each freelancer. (default: "freelancerfile.txt")
  -p:Input project file which contains projects' names and top 5 skills associated with each project. (default: "projectfile.txt")
  -t:Input Ground Truth file which contains the bidding projects for each freelancer and the associated top 5 skills with each project (default: "data/biddingfile.txt")
  -r:Output Preference Matrix as an input of Collaborative Filtering algorithm used in Apache Mahout Taste library (default: "data/preference.txt")
  -u:Output freelancer names used in Collaborative Filtering (default: "data/freelancername.txt")
  -j:Output project names used in Collaborative Filtering (default: "data/projectname.txt')
  -s:Output skill names</p>

<hr><hr><h2>
<a name="user-content-package-collaborativefiltering-includes-3-java-files" class="anchor" href="#package-collaborativefiltering-includes-3-java-files"><span class="octicon octicon-link"></span></a>Package collaborativefiltering includes 3 java files.</h2>

<p>UserBased.java
  implements user-based collaborative filtering recommendation algorithm based on Apache Mahout Taste library.
Arguments:
  -o:Output result file (default: "data/User_based_recommendation_result.txt")
  -r:Input Preference Matrix as an input of Collaborative Filtering algorithm used in Apache Mahout Taste library (default: "data/preference.txt")
  -u:Input freelancer names used in Collaborative Filtering (default: "data/freelancername.txt")
  -j:Input project names used in Collaborative Filtering (default: "data/projectname.txt')</p>

<hr><p>ItemBased.java
  implements item-based collaborative filtering recommendation algorithm based on Apache Mahout Taste library.
Arguments:
  -o:Output result file (default: "data/Item_based_recommendation_result.txt")
  -r:Input Preference Matrix as an input of Collaborative Filtering algorithm used in Apache Mahout Taste library (default: "data/preference.txt")
  -j:Input project names used in Collaborative Filtering (default: "data/projectname.txt')</p>

<hr><p>RecIREvaluator.java
  implements information retrieval evaluation methods for user-based collaborative filtering recommendation algorithm based on Apache Mahout Taste library.
Arguments:
  -r:Input Preference Matrix as an input of Collaborative Filtering algorithm used in Apache Mahout Taste library (default: "data/preference.txt")</p>

<hr><hr><p>In data folder, there should be three input files: freelancerfile.txt, projectfile.txt, and biddingfile.txt. finishedfile.txt which contains the finished projects for each freelancer and the associated top 5 skills.</p>

<p>In lib folder, there should be the Apache Mahout jar package and its denpendency packages.</p></article>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.04167s from github-fe126-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close js-ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

  </body>
</html>

