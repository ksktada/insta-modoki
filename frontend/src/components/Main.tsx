import React from 'react';
import Posts from './Posts';
import Profile from './Profile';

let photoList: string[] = ["a", "b"];

// Contents Container
function Main() {
    return (
        <div>
            <>
                <Profile name="hoge" id="hogehoge" followers={10} followings={20}></Profile>
                <Posts photoList={photoList}></Posts>
            </>
        </div>
    )
}

export default Main;