import React from 'react';
import FileNodes from './FileNodes';
import Directory from './Directory';

export default class Root extends Directory {

  componentWillMount() {
    // FIXME: exists altanarive way?
    const baseUrl = document.querySelector('header.main-header a.logo').getAttribute('href');
    const relPath = document.location.pathname.replace(baseUrl, '');
    this.setState({
      rootPath: `${baseUrl}${relPath.match(/^\/?[^/]+\/[^/]+/)}`,
    });
  }

  render() {
    const arrow = this.state.expanded ? 'octicon octicon-chevron-down' : 'octicon octicon-chevron-right';
    return (
      <div className="tree-node">
        <button className="root-expander" onClick={() => this.toggleFolder(`${this.state.rootPath}/explore/`)} >
          <i className={arrow} />
        </button>
        <a href={this.state.rootPath} className="submenu-files" >
          <i className="menu-icon octicon octicon-file-directory" />
          Files
        </a>
        <div className="file-tree" style={this.state.expanded ? {} : { display: 'none' }} >
          <FileNodes data={this.state.children} />
        </div>
      </div>
    );
  }
}